package lab7;
import java.math.BigInteger;

public class P10_21 {
	public static void main(String[] args) {
		int count = 0; // initialize counter
		
		// Initialize BigIntegers
		BigInteger n = new BigInteger (String.valueOf(Long.MAX_VALUE));
		BigInteger five = new BigInteger ("5");
		BigInteger six = new BigInteger ("6");
		BigInteger zero = new BigInteger ("0");
		
		// Display results
		System.out.println("First 10 numbers greater than LONG.MAX_VALUE and divisible by 5 or 6:");
		while(count < 10) {
			n = n.add(new BigInteger("1"));
			if((n.remainder(five)).compareTo(zero) == 0 || (n.remainder(six)).compareTo(zero) == 0) {
				System.out.println(n);
				count++;
			}
		}
	}

}
