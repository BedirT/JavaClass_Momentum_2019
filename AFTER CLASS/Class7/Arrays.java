import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays are one of the most popular data structures
		// we have in Java. It is an ordered list that we keep 
		// track of the data we have.
		
		int[] nums = new int[6];
//		System.out.println(nums[0]);

		int[] nums2 = { 2017, 7, 5, 9, 30 };
		
		for (int i = 0; i < nums2.length; i++)
			System.out.printf("%d\n", nums2[i]);
		
		// Create an array of doubles and print it all on the screen
		double[] nums3 = {1.2, 1.3, 1.5, .5};
		for (int i = 0; i < nums3.length; i++)
			System.out.printf("%.2f\n", nums3[i]);
		
		// Create a 2D Array of integers and print it all on the screen
//		int[][] name = new int[3][3];
		int[][] name = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[i].length; j++) {
				System.out.println(name[i][j]);
			}
		}
		
		int[] ar = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < ar.length; i++) {
			System.out.print("Please enter a number: ");
			int a = sc.nextInt();
			ar[i] = a;
		}
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		} 
		
		
	}

}
