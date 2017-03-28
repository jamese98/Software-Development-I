package lab8;

public class P11_5 {
	public static void main(String[] args) {
		// Create new course
		Course CMPT220 = new Course("CMPT220");
		
		// Add three students to course
		CMPT220.addStudent("James");
		CMPT220.addStudent("Daniel");
		CMPT220.addStudent("Brendan");
		
		// Drop one student
		CMPT220.dropStudent("Brendan");
		
		// Display all students enrolled in course
		System.out.println(CMPT220.getCourseName() + " roster: ");
		String[] students = CMPT220.getStudents(); // create array with list of students
		for(int i = 0; i < CMPT220.getNumberOfStudents(); i++) {
			System.out.println(students[i] + " ");
		}
		
	}


}
