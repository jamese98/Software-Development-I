package lab9;

public class P12_7 {
	public static void main(String[] args) {
		
	}
	
	private double bin2Dec(String binaryString) throws NumberFormatException {
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