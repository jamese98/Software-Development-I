package lab9;

public class P12_7 {
	public static void main(String[] args) {
		//JA
		System.out.println(bin2Dec("111"));
		System.out.println(bin2Dec("ABC"));		
	}
	
	private static double bin2Dec(String binaryString) throws NumberFormatException { // JA
		int decimal = 0;
		for(int i = 0, j = binaryString.length() -1;
				i < binaryString.length(); i++, j--) {
			if(binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		return decimal;
	}

}
