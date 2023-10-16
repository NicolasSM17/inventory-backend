package pe.nico.cibertec.service;

import org.springframework.http.ResponseEntity;

import pe.nico.cibertec.model.Category;
import pe.nico.cibertec.response.CategoryResponseRest;

public interface ICategoryService {
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
}
