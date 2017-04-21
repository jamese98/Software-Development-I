package lab10;
import java.util.ArrayList;

public class P13_3 {
	// Initialize ArrayList
	ArrayList<Number> list = new ArrayList<Number>();
	
	/** Main Method */
	public static void main(String[] args) {
		// Initialize ArrayList
		ArrayList<Number> list = new ArrayList<>();
		
		// Populate ArrayList
		list.add(5);
		list.add(8.2);
		list.add(3.7);
		list.add(6);
		list.add(9.4);
		list.add(2);
		list.add(4);
		list.add(5.1);
		list.add(8);
		list.add(1);
		list.add(3);
		
		// Print unsorted list
		System.out.println(list.toString());
		
		// Sort list using sort method
		sort(list);
		
		// Print sorted list
		System.out.println(list.toString());
		
	}
	
	/** Method to sort an ArrayList of numbers in increasing order */
	public static void sort(ArrayList<Number> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			// Initialize variables to store smallest values
			Number min = list.get(i);
			int minIndex = i;
			
			// Check if each number is bigger than current min value
			for(int j = i + 1; j < list.size(); j++) {
				if(min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}
			
			// Update min value
			if(minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
					
	}

}
