
public class StringsInJava {

public static void main(String[] args) {
		
		String str1 = "compsci";
		
		String str2 = new String("Hello" + " Houston");
		
		String str3 = new String("Hello Houston");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		//////////////////////////////////////
		String str = "Comp science";
		// A string is a group of characters. 
		// The first character in the group 
		// is at position 0.
		
//		System.out.println(str);
		
		// Frequently used methods of String
		System.out.println(str.charAt(0));
		
		System.out.println(str.substring(5, 12));
		System.out.println(str.substring(5));
		
		System.out.println(str.length());
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.compareTo("Comp science"));
		
		System.out.println(str.equals("Comp science"));
		System.out.println(str.equals("Comp scienc"));
		
		String strTr = "  Hey Im here  ";
		System.out.println(strTr.trim());
		
		System.out.println(str.indexOf('o'));
		System.out.println(str.lastIndexOf('c'));

	}

}