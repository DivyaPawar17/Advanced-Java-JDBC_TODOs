package it.education.entity;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseProvider;
	private int courseHours;
	private int courseFess;
	
	public Course(int courseId, String courseName, String courseProvider, int courseHours, int courseFess) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseProvider = courseProvider;
		this.courseHours = courseHours;
		this.courseFess = courseFess;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseProvider() {
		return courseProvider;
	}

	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}

	public int getCourseHours() {
		return courseHours;
	}

	public void setCourseHours(int courseHours) {
		this.courseHours = courseHours;
	}

	public int getCourseFess() {
		return courseFess;
	}

	public void setCourseFess(int courseFess) {
		this.courseFess = courseFess;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseProvider=" + courseProvider
				+ ", courseHours=" + courseHours + ", courseFess=" + courseFess + "]";
	}
	
	

}

