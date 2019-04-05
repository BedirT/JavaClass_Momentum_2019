public class Homework6_answer {

	// Create four functions;
	// 		1- Converts hexadecimal to decimal
	// 		2- Converts octadecimal to decimal
	//		3- Converts binary to decimal
	// 		4- Converts decimal to octadecimal 
	// Do not use ready functions, all process
	// must be done manually.
	public static int hexaToDec(String hex){

		int theNum = 0;

		for(int i = 0 ; i < hex.length(); i++){
			char a = hex.charAt(hex.length()-i-1);
			
			if(a == 'A') 		theNum += 10 * Math.pow(16, i);
			else if (a == 'B') 	theNum += 11 * Math.pow(16, i);
			else if (a == 'C')	theNum += 12 * Math.pow(16, i);
			else if (a == 'D')	theNum += 13 * Math.pow(16, i);
			else if (a == 'E')	theNum += 14 * Math.pow(16, i);
			else if (a == 'F')	theNum += 15 * Math.pow(16, i);
			else theNum += Character.getNumericValue(a) * Math.pow(16, i);
//			System.out.println(a + " " + theNum);
		}

		return theNum;

	}
	
	public static int octaToDec(String oct){

		int theNum = 0;

		for(int i = 0 ; i < oct.length(); i++){
			char a = oct.charAt(oct.length()-i-1);
			theNum += Character.getNumericValue(a) * Math.pow(8, i);
		}

		return theNum;

	}
	
	public static int binToDec(String bin){

		int theNum = 0;

		for(int i = 0 ; i < bin.length(); i++){
			char a = bin.charAt(bin.length()-i-1);
			theNum += Character.getNumericValue(a) * Math.pow(2, i);
		}

		return theNum;

	}
	
	public static String decToOct(int dec){

		int k = 0;
		String theNum = "";

		while(dec > 0) {
			int a = dec % 8;
			dec /= 8;
			theNum = a + theNum;
		}

		return theNum;

	}
	
	public static void main(String[] args) {

		System.out.println(hexaToDec("AE9"));
		System.out.println(octaToDec("4536"));
		System.out.println(binToDec("100101110101"));
		System.out.println(decToOct(2398));
		
	}

}
