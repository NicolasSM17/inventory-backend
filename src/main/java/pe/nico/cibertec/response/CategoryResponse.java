package pe.nico.cibertec.response;

import java.util.List;

import lombok.Data;
import pe.nico.cibertec.model.Category;

@Data
public class CategoryResponse {
	private List<Category> category;
}
