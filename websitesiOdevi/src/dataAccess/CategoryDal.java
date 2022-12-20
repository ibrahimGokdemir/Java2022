package dataAccess;
import entities.Category;

public interface CategoryDal {
	
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	
}
