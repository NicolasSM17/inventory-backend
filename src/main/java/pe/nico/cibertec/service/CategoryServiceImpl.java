package pe.nico.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.nico.cibertec.dao.ICategoryDao;
import pe.nico.cibertec.model.Category;
import pe.nico.cibertec.response.CategoryResponseRest;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ICategoryDao categoryDao;

	@Override
	@Transactional(readOnly = true)
	public ResponseEntity<CategoryResponseRest> search() {
		CategoryResponseRest response = new CategoryResponseRest();
		
		try {
			List<Category> category = (List<Category>) categoryDao.findAll();
			response.getCategoryResponse().setCategory(category);
			response.setMetadata("Respuesta ok", "00", "Respuesta exitosa");
		} catch (Exception e) {
			response.setMetadata("Respuesta erronea", "-1", "Error al consultar");
			e.printStackTrace();
			return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);
	}

}
