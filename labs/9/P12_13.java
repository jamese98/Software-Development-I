package lab9;
import java.io.*;
import java.util.*;

public class P12_13 {

	public static void main(String[] args) throws Exception {
		// Display usage message
		if(args.length != 1) {
			System.out.println("Usage: filename");
			System.exit(1);
		}
		
		// Check that file exists
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("'" + args[0] + "'" + " does not exist");
			System.exit(2);
		}
		
		// Initialize counting variables
		int chars = 0;
		int words = 0;
		int lines = 0;
		
		// Count lines and characters
		try(
				// Create input file
				Scanner input = new Scanner(file);
		) {
			while(input.hasNext()) {
				lines++;
				String line = input.nextLine();
				chars += line.length();
			}
		}
		
		// Count words
		try(
				// Create input file
				Scanner input = new Scanner(file);
		) {
			while(input.hasNext()) {
				words++;
			}
		}
		
		// Display results
		System.out.println(file.getName() + ":" + chars + "characters, " + 
							                 words + "words, " + 
											 lines + "lines");

	}

}
