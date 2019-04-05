import java.util.Scanner;

public class arrays_ex1 {

	public static void main(String[] args) {
		// get n numbers from user and print n lines
		// that each has the difference of the current
		// value from the sum of all the numbers

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		int sum = 0;
		
		for (int i = 0 ; i < n; i++) {
			System.out.print("Enter the next item: ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		for (int i = 0 ; i < n; i++) {
			System.out.println(Math.abs(sum - nums[i]));
		}
		

		
	}

}
