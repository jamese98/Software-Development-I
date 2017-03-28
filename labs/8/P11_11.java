package lab8;
import java.util.ArrayList;
import java.util.Scanner;

public class P11_11 {
	
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize ArrayList
		ArrayList<Integer> numbers;
		numbers = new ArrayList<Integer>();
		
		// Prompt user to enter five numbers and add them to list
		System.out.print("Enter five integers: ");
		for(int i = 0; i < 5; i++) {
			numbers.add(input.nextInt());
		}
		
		// Call sort method
		sort(numbers);
		
		// Display results
		System.out.println(numbers);
		
	}
	
	/** Method: Sort an ArrayList of integers using the java Collections class */
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
		
	}

}
