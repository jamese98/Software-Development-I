package lab8;
import java.util.ArrayList;
import java.util.Scanner;

public class P11_13 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize ArrayList
		ArrayList<Integer> numbers;
		numbers = new ArrayList<Integer>();
		
		// Prompt user to enter ten numbers and add them to list
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++) {
			numbers.add(input.nextInt());
		}
		
		// Call removeDuplicate method
		removeDuplicate(numbers);
		
		// Display results
		System.out.print("The distinct integers are ");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}

	}
	/** Method: Remove duplicate integers from an ArrayList */
	// JA: A better approach is to replicate the array without the duplicates
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		
	}
	

}

