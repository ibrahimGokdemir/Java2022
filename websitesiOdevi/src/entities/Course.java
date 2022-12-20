package entities;

public class Course {
	private int id;
	private String name;
	private int unitePrice;
	private String trainer;
	private String category;
	private String courseImage;
	
	public Course() {

	}
	public Course(int id, String name, int unitePrice, String trainer, String category, String courseImage) {
		this.id = id;
		this.name = name;
		this.unitePrice = unitePrice;
		this.trainer = trainer;
		this.category = category;
		this.courseImage = courseImage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitePrice() {
		return unitePrice;
	}
	public void setUnitePrice(int unitePrice) {
		if(unitePrice>0) {
			
		this.unitePrice = unitePrice;
		}
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	
}
