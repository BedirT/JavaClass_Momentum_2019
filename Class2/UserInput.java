// 2nd Class 4th Part

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		System.out.println("You entered " + num);
		
		// Now scan text & double and print
		// Additional code goes below this line
		System.out.print("Enter Your Name: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Hi, " + name);
		System.out.print("What is 3 + 2.2: ");
		float res = scan.nextFloat();
		System.out.println("The result is " + res);
		
		// Additional code goes above this line
		
//		sc.close();

	}

}
