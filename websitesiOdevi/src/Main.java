import java.util.List;

import business.CourseManager;
import dataAccess.CourseDal;
import dataAccess.courseDal.HibernateCourseDal;
import entities.Category;
import entities.Course;
import logging.FileLogger;
import logging.Logger;

public class Main {

	public static void main(String[] args) {

		List<Logger> loggers;

		Category category1 = new Category(1,"Programlama","Kurumsal");
		
		Course course1=new Course(1,"Java",100,"Engin","Backend","Random.jpg");
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDal(),course1);
		courseManager.add(course1);
		
	}

}

//public CourseManager(CourseDal courseDal, Course course, List<Logger> loggers)