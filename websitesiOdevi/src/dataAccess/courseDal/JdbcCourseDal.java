package dataAccess.courseDal;
import dataAccess.CourseDal;
import entities.Course;

public class JdbcCourseDal implements CourseDal{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile database'e eklendi.");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile database'e silindi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile database'e güncellendi.");
		
	}

}
