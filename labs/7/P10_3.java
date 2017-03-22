package lab7;

public class P10_3 {

	public static void main(String[] args) {
		// Initialize test array
		int[] values = {1, 2, 3, 4, 5};
		
		/** Test methods to check values */
		// Test isEven(int)
		System.out.println("Test using isEven(int):");
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
		}
		System.out.println();
		
		// Test isOdd(int)
		System.out.println("Test using isOdd(int):");
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
		}
		System.out.println();
		
		// Test isPrime(int)
		System.out.println("Test using isPrime(int):");
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
		}
		System.out.println();
		
		/** Test methods to check specific values*/
		// Test isEven(myInteger)
		System.out.println("Test using isEven(myInteger)");
		for(int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]); // Call MyInteger constructor to create object
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}
		System.out.println();
		
		// Test isOdd(myInteger)
		System.out.println("Test using isOdd(myInteger)");
		for(int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]); // Call MyInteger constructor to create object
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}
		System.out.println();
		
		// Test isPrime(myInteger)
		System.out.println("Test using isPrime(myInteger)");
		for(int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]); // Call MyInteger constructor to create object
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}
		System.out.println();
		
		/** Test equals methods */
		// Test equals(int)
		int[] testValues = {6, 7, 8};
		MyInteger value = new MyInteger(7);
		System.out.println("Test if " + value.getValue() + " is equal to specified value");
		for(int i = 0; i < testValues.length; i++) {
			System.out.println(testValues[i] + " " + values.equals(testValues[i]));
		}
		
		// Test equals(MyInteger)
		System.out.println("Test if " + value.getValue() + " is equal to specified value");
		for(int i = 0; i < testValues.length; i++) {
			MyInteger myInteger = new MyInteger(testValues[i]);
			System.out.println(testValues[i] + " " + value.equals(myInteger));
		}
		System.out.println();
		
		/** Test parseInt methods */
		// Test parseInt(char[])
		System.out.println("Test parseInt(char[]) and parseInt(String)");
		char[] charArray = {'3', '2', '1'};
		
		// Test parseInt(String)
		String str = "654";
		System.out.print("\'");
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + "");
		}
		System.out.println("\' + \"" + str + "\" = " + (MyInteger.parseInt(charArray) + 
				MyInteger.parseInt(str)));
	}

}
