package dataAccess.categoryDal;

import dataAccess.CategoryDal;
import entities.Category;

public class JdbcCategotyDal implements CategoryDal{

	@Override
	public void add(Category category) {
		 System.out.println("JDBC ile database'e eklendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile databaseden silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile databaseden güncellendi.");
		
	}

}
