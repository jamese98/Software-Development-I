package lab8;
import java.util.ArrayList;
import java.util.Scanner;

public class P11_17 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter an integer
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		
		// Initialize ArrayList to store smallest factors
		ArrayList<Integer> factors = new ArrayList<>();
		
		// Use getFactors method to find factors of number
		getFactors(m, factors);
		
		// Output results
		System.out.println("The smallest number n for m * n to be a " +
				           "perfect square is " + smallestSquare(factors));
		System.out.println("m * n is " + m * smallestSquare(factors));
	}
	
	/** Method: Return smallest square from an arraylist of integers */
	private static int smallestSquare(ArrayList<Integer> factors) {
		int[][] occurences = copy(factors);
		for(int i = 0; i < factors.size(); i++) {
			search(occurences, i);
		}
		
		// Remove odd duplicates
		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurences);
		
		// Find and return smallestSquare
		int smallestSquare = 1;
		for (int i = 0; i < oddSequenceFactors.size(); i++) {
			smallestSquare *= i;
		}
		return smallestSquare;
	}
	
	/** Method: Remove duplicates from a 2D array of integers */
	private static ArrayList<Integer> removeDuplicates(int[][] m) {
		// Initialize temp ArrayList
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i][1] % 2 != 0) {
				temp.add(m[i][0]);
			}
		}
		
		// Remove duplicates
		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for(int i = 0; i < temp.size(); i++) {
			if(!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add(temp.get(i));
			}
		}
		
		return duplicateRemoved;
	}
	
	/** Search for an integer in a 2D array */
	private static void search(int[][] m, int number) {
		for(int i = 0; i < m.length; i++) {
			if(m[i][0] == number) {
				m[i][1]++;
			}
		}
	}
	
	/** Copy factors into 2D array */
	private static int[][] copy(ArrayList<Integer> factors) {
		int[][] temp = new int[factors.size()][2];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		return temp;
	}
	
	/** Get factors of integers from an ArrayList */
	private static void getFactors(int m, ArrayList<Integer> factors) {
		int count = 2;
		while(count <= m) {
			if(m % count == 0) {
				factors.add(count);
				m /= count;
			} else {
				count++;
			}
		}
	}
}
