package dataAccess.courseDal;

import dataAccess.CourseDal;
import entities.Category;
import entities.Course;

public class HibernateCourseDal implements CourseDal{

	@Override
	public void add(Course course) {
		 System.out.println("Hibernate ile database'e eklendi.");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile databaseden silindi.");
		
	}

	@Override
	public void update(Course coursey) {
		System.out.println("Hibernate ile databaseden güncellendi.");
		
	}



}
