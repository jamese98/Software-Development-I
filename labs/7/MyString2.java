package lab7;

public class MyString2 {
	// Initialize string variable
	private String str;
	
	/** Constructor: MyString2 */
	public MyString2(String str) {
		this.str = "";
		for(int i = 0; i < str.length(); i++) {
			this.str += str.charAt(i) + "";
		}
	}
	
	/** Method: Return number <, >, or = to zero related to whether string is >, <, or + to str */
	public int compare(String s) {
		int index = 0;
		if(this.str.length() < str.length()) {
			index = -1;
		}
		if (str.length() < this.str.length()); {
			index = 1;
		}
		
		for(int i = 0; i < this.str.length(); i++) {
			if(this.str.charAt(i) < s.charAt(i)) {
				index = -(i + 1);
			}
			if(this.str.charAt(i) > s.charAt(i)) {
				index = i + 1;
			}
		}
		return index;
	}
	
	
	/** Substring begin method */
	public MyString2 substring(int begin) {
		String b = "";
		for(int i = begin, j = 0; i < str.length(); i++, j++) {
			b += str.charAt(i) + "";
		}
		return new MyString2(b);
	}
	
	/** Convert MyString2 to uppercase */
	public MyString2 toUpperCase() {
		String n = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				n += String.valueOf((char)(str.charAt(i) - 32));
			} else {
				n += String.valueOf(str.charAt(i));
			}
		}
		return new MyString2(n);
	}
	
	/** Convert string to array of characters */
	public char[] toChars() {
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}
	
	/** Convert boolean to MyString2 object */
	public static MyString2 valueOf(boolean b) {
		if(b) {
			return new MyString2("true");
		} else {
			return new MyString2("false");
		}
	}
	

}
