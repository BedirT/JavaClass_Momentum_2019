// 3rd Class 1st Part

public class forLoop {

	public static void main(String[] args) {
		
		/*
		 * Comment your programs, so that you will have understanding later on when
		 * you look at the code
		 */

		// How to use loops...
		// For loop
		// for( variable = starting value; the condition to execute ; increment, decrement){
		// 		- operation wanted to compute
		// } 
		
		// Print from 1 to 10
		for(int i = 1; i <= 10; i = i+1) {
			System.out.println(i);
		}
		int i;
		for(i = 1; i <= 10; i = i+1) {
			System.out.println(i);
		}
		for(i = 1; i < 11; i = i+1) {
			System.out.println(i);
		}
		for(i = 1; i != 11; i = i+1) {
			System.out.println(i);
		}
		// standard vs
		for(int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
//		Finding max_value of 2's powers that 
//		we can reach with int
		int a = Integer.MAX_VALUE;
		System.out.println(a + 2);
		for(int j=1; j <= Integer.MAX_VALUE/2; j=j*2) {
			System.out.println(j);
		}
		
		// Finding 2^(63) - Print All the powers of 2,
		// beginning from 1 to 63
		long res = 2;
		for(int j = 1; j <= 63; j++) {
			System.out.println("2^" + j + " is " + res);
			res = res * 2;
		}
	}
}
