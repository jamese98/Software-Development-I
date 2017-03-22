package lab7;

public class Course {
	// Initialize variables
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;
	
	/** Course constructor */
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	/** Method to add student to course */
	public void addStudent(String student) {
		// Improvement: automatically increase string size
		if(numberOfStudents == students.length) {
			String[] a = new String[students.length + 1]; // create temporary array
			for(int i = 0; i < numberOfStudents; i++) {
				a[i] = students[i]; // copy each element students array to temp array
			}
			students = a; // update students array
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	/** Method: Get array of students in a class */
	public String[] getStudents() {
		return students;
	}
	
	/** Method: Get number of students in ca class */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	/** Method: return name of course */
	public String getCourseName() {
		return courseName;
	}
	
	/** Methods: Remove student from class */
	public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		} else {
			System.out.println(student + " is not in course " + courseName);
		}
	}
	
	// Method to delete student from course
	private void dropStudent(int index) {
		String[] str = new String[students.length - 1];
		for(int i = 0, j = 0; i < str.length; i++, j++) {
			if(i == index) {
				j++;
			}
			str[i] = students[j];
		}
		
		this.students = str;
		numberOfStudents--;
	}
	
	/** Method: Get number of students in class */
	private int findStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
	
	/** Method: Remove all stuents from class */
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
}
