// 3rd Class 3rd Part

public class forLoopExercises2 {

	public static void main(String[] args) {

		// Find and print the sum of all the numbers 
		// from 1 to 10
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// Find and print the sum of all the numbers 
		// from 1 to 100
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// Find and print the sum of all 
		// the odd numbers 
		// from 1 to 1000		
		sum = 0;
		for(int i = 1; i <= 1000; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// Find and print the sum of all 
		// the even numbers 
		// from 200 to 10200
		sum = 0;
		for(int i = 200; i <= 10200; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		

	}

}
