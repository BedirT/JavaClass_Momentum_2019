import java.util.Scanner;

public class whileLoopExercise1 {

	public static void main(String[] args) {
		
		// Print all the divisors of n, where n is taken as input from user. 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			if(n % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}

}
