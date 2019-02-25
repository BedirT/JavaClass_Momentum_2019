
public class StringExercise3 {

	public static void main(String[] args) {
		
		// Given two strings, return their concatenation, 
		// but the first characters are dropped. For example, 
		// “Hello” and “World” will produce “elloorld”.
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.print(str1.substring(1));
		System.out.println(str2.substring(1));
		
		for(int i = 1; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		for(int i = 1; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
		

	}

}
