package business;

import java.util.List;
import dataAccess.CourseDal;
import entities.Course;
import logging.Logger;

public class CourseManager {

	private CourseDal courseDal;
	private Course course;
	private List<Logger> loggers;

	public CourseManager(CourseDal courseDal, Course course, List<Logger> loggers) {
		this.courseDal = courseDal;
		this.course = course;
		this.loggers = loggers;
	}
	public CourseManager(CourseDal courseDal, Course course) {
		this.courseDal = courseDal;
		this.course = course; }
	
	public void add(Course course) {
		
		courseDal.add(course);
		for(Logger logger:loggers) {
			
			logger.getData(course.getName());
		}
	}
	public void delete(Course course) {
		
		courseDal.delete(course);
		for(Logger logger:loggers) {
			
			logger.getData(course.getName());
		}
	}
	public void update(Course course) {
		
		courseDal.update(course);
		for(Logger logger:loggers) {
			
			logger.getData(course.getName());
		}
	}
}
