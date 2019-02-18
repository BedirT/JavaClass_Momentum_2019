// 3rd Class 4th Part

public class forLoopExercises3 {

	public static void main(String[] args) {
		
		// Find and print squares of odd numbers from 1 to 15
		
		for(int i=1; i <=15; i+=2) {
			System.out.println(i*i);			
		}
		
		// Find and print 10!
		
		int sum = 1;
		for(int i=1; i<=10; i++) {
			sum= sum*i;
		}
		System.out.println(sum);
		
		// Find and print 13!
		
		long suml = 1;
		for(int i=1; i<=13; i++) {
			suml = suml*i;
		}
		System.out.println(suml);	

	}

}
