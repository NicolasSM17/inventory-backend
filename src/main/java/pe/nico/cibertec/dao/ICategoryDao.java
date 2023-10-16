package pe.nico.cibertec.dao;

import org.springframework.data.repository.CrudRepository;

import pe.nico.cibertec.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
