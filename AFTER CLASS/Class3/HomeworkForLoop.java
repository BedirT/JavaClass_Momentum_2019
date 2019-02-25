import java.util.Random;
import java.util.Scanner;


public class HomeworkForLoop {

	public static void main(String[] args) {
		/*
		  
		   Write a program that generates a random number and asks the user to guess what the number is. 
		   If the user's guess is higher than the random number, the program should display "Too high, 
		   try again." If the user's guess is lower than the random number, the program should display 
		   "Too low, try again." The program should use a loop that repeats until the user correctly 
		   guesses the random number.
		  
		 */
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100), guesses = 0;
		System.out.print("Can you guess the number? (1-100)");
		for(int userGuess = 0 ; userGuess != number; guesses++) {
			System.out.print("Guess: ");
			userGuess = scan.nextInt();
			if(userGuess < number) {
				System.out.println("Up");
			} else if(userGuess > number) {
				System.out.println("Down");
			}
		}
		System.out.println("Congratulations! That is the number!");
		System.out.println("It took you " + guesses+1 + " guesses!");
		scan.close();
		
}}