// 3rd Class 5th Part
import java.math.BigInteger;

public class forLoopExercises4 {

	public static void main(String[] args) {
		
		// Find and print the 40th term of Fibonacci
		
		int num1 = 1;
		int num2 = 1;
		for(int i = 2; i < 40; i++) {
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
		}
		System.out.println(num2);
		
		// EXTRA - Challenge
		// 100th term ... ?
		// java.math.BigInteger
		BigInteger fb = new BigInteger("2");
		BigInteger fb2 = new BigInteger("5");
		for (int i = 2; i < 100; i++) {
			BigInteger temp = fb2;
			fb2 = fb2.add(fb);
			fb = temp;
		}
		System.out.println(fb2);

	}

}
