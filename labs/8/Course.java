package lab8;

import java.util.ArrayList;

public class Course {
	// Initialize variables
	private String courseName;
	private ArrayList<String> students;
	
	/** Course constructor */
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	
	/** Method to add student to course */
	public void addStudent(String student) {
		students.add(student);
	}
	
	/** Method: Get array of students in a class */
	public String[] getStudents() {
		String[] s = new String[students.size()];
		return students.toArray(s);
	}
	
	/** Method: Get number of students in a class */
	public int getNumberOfStudents() {
		return students.size();
	}
	
	/** Method: return name of course */
	public String getCourseName() {
		return courseName;
	}
	
	/** Method: Remove student from class */
	public void dropStudent(String student) {
		students.remove(student);
	}
	

}
