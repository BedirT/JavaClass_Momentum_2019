
public class StringExercise2 {

	public static void main(String[] args) {
		
		// Read a string from the keyboard, and print 
		// out a new string where 
		// every char in the original is duplicated.
		String str = "Duplicate the letters";
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			System.out.print(str.charAt(i));
		}
		
	}

}
