import java.util.Scanner; 

public class forLoopExercises6_Extra {

	public static void main(String[] args) {

		// Write a program to enter the numbers till the user wants and at the 
		// end it should display the count of positive, negative and zeros entered. 
		Scanner sc = new Scanner(System.in);
		int pos = 0, neg = 0, zero = 0;
		System.out.print("How many numbers you want to enter? ");
		int t = sc.nextInt();
		for(int i = 0; i < t ; i++) {
			int choice = sc.nextInt();
			if(choice > 0) {
				pos++;
			} else if(choice < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		System.out.println("Positive = " + pos);
		System.out.println("Negative = " + neg);
		System.out.println("Zeros = " + zero);
		
		
		// Write a program to print out all Armstrong numbers between 1 and 500. 
		// If sum of cubes of each digit of the number is equal to the number itself, 
		// then the number is called an Armstrong number. For example;
		// 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
		for(int i = 1; i <= 500; i++) {
			int unit = i % 10;
			int tenth = (i / 10) % 10;
			int hundred = (i / 100) % 10;
			if(unit*unit*unit + tenth*tenth*tenth + hundred*hundred*hundred == i) {
				System.out.println(i);
			}
		}
		
		

	}

}
