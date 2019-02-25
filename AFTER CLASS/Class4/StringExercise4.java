
public class StringExercise4 {

	public static void main(String[] args) {
		// Read a complete name (first name and last
		// name separated by a space) from keyboard.
		// Print the first and last names explicitly.
		// For example, “John Smith” will produce the
		// output:
		// Firstname: John
		// Lastname: Smith
		String name = "John Smith";
		
		System.out.println("Firstname: " + name.substring(0, name.indexOf(' ')));
		System.out.println("Lastname: " + name.substring(name.indexOf(' ') + 1));
		
		int space = name.indexOf(' ');
		for(int i = 0; i < space; i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		for(int i = space+1; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		
	}

}
