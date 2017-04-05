package lab9;
import java.io.*;
import java.util.*;

public class P12_11 {
	public static void main(String[] args) throws Exception {
		// Display usage message
		if(args.length != 2) {
			System.out.println("Usage: TextToRemve filename");
			System.exit(1);
		}
		
		// Check if file exists
		File file = new File(args[1]);
		if(!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}
		
		// Create arraylist to store contents of source file
		ArrayList<String> fileContent = new ArrayList<>();
		try(Scanner input = new Scanner(file);) {
			while(input.hasNext()) {
				String temp = input.nextLine();
				fileContent.add(removeString(args[0], temp));
			}
		}
		
		// Create output file
		try(PrintWriter output = new PrintWriter(file);) {
			for(int i = 0; i < fileContent.size(); i++) {
				output.println(fileContent.get(i));
			}
		}
	}
	
	/** Method: Remove string from file */
	public static String removeString(String string, String line) {
		StringBuilder stringBuilder = new StringBuilder(line);
		
		// Initialize variables to search file
		int start = stringBuilder.indexOf(string);
		int end = string.length();
		
		// Search file for string to remove
		while(start >= 0) {
			end = start + end;
			stringBuilder = stringBuilder.delete(start, end); // delete string
			start = stringBuilder.indexOf(string, start);
		}
		
		return stringBuilder.toString();
	}
	
	

}
