import java.util.ArrayList;

public class ArrayList_ex1 {

	public static void main(String[] args) {
		
		// Create a String array list, and add 2 letters in it
		// Remove all the elements
		// Add two new letters and print the list
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.clear();
		ar.add("C");
		ar.add("D");
		System.out.println(ar);
		
		
	}

}