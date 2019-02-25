
public class StringExercise1 {

	public static void main(String[] args) {
		
		// Print reversed version of the input string
		String str = "Here is the string";
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
