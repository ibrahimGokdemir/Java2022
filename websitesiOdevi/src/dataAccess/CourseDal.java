package dataAccess;

import entities.Course;

public interface CourseDal {
	
	void add(Course course);
	void delete(Course course);
	void update(Course course);

}
