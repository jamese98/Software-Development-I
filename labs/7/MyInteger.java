package lab7;

public class MyInteger {
	// Initialize value variable
	int value;
	
	/** MyInteger constructor */
	MyInteger(int value) {
		this.value = value;
	}
	
	/** Method: Return value of MyInteger */
	public int getValue() {
		return value;
	}
	
	/** Methods to check values */
	// Return if value is even
	public boolean isEven() {
		return isEven(value); 
	}

	// Return if value is odd
	public boolean isOdd() {
		return isOdd(value); 
	}

	// Return if value is prime
	public boolean isPrime() {
		return isPrime(value);
	}
	
	/** Methods to check specified values */
	// Return if specified value is even
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	// Return if specified value is odd
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	// Return if specified value is prime
	public static boolean isPrime(int value) {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) 
				return false;
		}
		return true;
	}
	
	/** Methods to check values in object */
	// Return if specified value in object is even
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}
	
	// Return if specified value in object is odd
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}
	
	// Return if specified value in object is prime
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}
	
	/** Method to check if value in object equals object in specified value */
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}
	
	/** Method to convert array of numbers into an integer */
	public static int parseInt(char[] chars) {
		int value = 0;
		for(int i = 0, j = (int)Math.pow(10, chars.length -1);
				i < chars.length; i++, j/= 10) {
			value += (chars[i] - 48) * j;
		}
		return value;
	}
	
	/** Method to convert string to integer */
	public static int parseInt(String str) {
		int value = 0;
		for(int i = 0, j = (int)Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}
	
}

