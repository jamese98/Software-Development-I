package lab4;
import java.util.Arrays;

public class P72ReverseNumbers {

	public static void main(String[] args) {
		int[] numList = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original array: " + (Arrays.toString(numList)));
		
		for (int i = 0; i < numList.length / 2; i++) {
			int temp = numList[i];
			numList[i] = numList[numList.length - i - 1];
			numList[numList.length - i - 1] = temp;
		}
		System.out.println("Reversed array: " + (Arrays.toString(numList)));

	}

}
