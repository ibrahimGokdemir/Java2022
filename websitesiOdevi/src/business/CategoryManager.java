package business;

import java.util.Iterator;
import java.util.List;

import dataAccess.CategoryDal;
import entities.Category;
import logging.Logger;

public class CategoryManager {

	private CategoryDal categoryDal;
	private Category category;
	private List<Logger> loggers;

	public CategoryManager(CategoryDal categoryDal, Category category, List<Logger> loggers) {
		this.categoryDal = categoryDal;
		this.category = category;
		this.loggers = loggers;
	}

	public void add(Category category) {
		
		
		
		categoryDal.add(category);
		for (Logger logger : loggers) {
			logger.getData(category.getName());
		}
	}

	public void delete(Category category) {

		categoryDal.delete(category);
		for (Logger logger : loggers) {
			logger.getData(category.getName());
		}
	}

	public void update(Category category) {

		categoryDal.update(category);
		for (Logger logger : loggers) {
			logger.getData(category.getName());

		}
	}

}
