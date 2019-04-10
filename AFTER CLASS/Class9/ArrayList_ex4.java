import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ex4 {

	public static void main(String[] args) {
		
		// Read a list of integers from keyboard and then
		// print the minimum, the maximum, and the standard 
		// deviation of these integers.

		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter to stop inputting.");
		
		int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, sum = 0;
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			A.add(a);
			mn = Math.min(mn, a);
			mx = Math.max(mx, a);
			sum += a;
		}
		double mean = sum/A.size();
		double res = 0;
		for(int i = 0; i < A.size(); i++) {
			res += (A.get(i) - mean) * (A.get(i) - mean);
		}
		System.out.println("Min: " + mn);
		System.out.println("Max: " + mx);
		System.out.println("SD: " + Math.sqrt(res/A.size()));
	}

}
