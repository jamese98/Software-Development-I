package lab7;

public class P10_23 {
	public static void main(String[] args) {
		// Initialize MyString2 objects
		MyString2 str1 = new MyString2("test1");
		MyString2 str2 = new MyString2("test2");
		
		// Test compare method
		System.out.println("Test compare method:");
		System.out.println(str1.compare("test1"));
		System.out.println();
		
		// Test substring method
		System.out.println("Test substring method:");
		print(str2.substring(5));
		System.out.println();
		
		// Test uppercase method
		System.out.println("Convert str2 to uppercase:");
		print(str2.toUpperCase());
		System.out.println();
		
		// Test boolean to string conversion method
		System.out.println("Convert boolean to MyString2 object:");
		print(MyString2.valueOf(true));
	}
	
	/** Print MyString2 object */
	public static void print(MyString2 str){
		print(str.toChars());
	}
	
	/** Print characters in array */
	public static void print(char[] chars){
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}

}
