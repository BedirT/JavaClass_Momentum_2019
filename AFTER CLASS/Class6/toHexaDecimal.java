import java.util.Scanner;

public class toHexaDecimal {

	public static void toHexa(int n) {
		String hexa = "";
		while(n > 0){
			int val = n % 16;
			if(val <= 9) hexa = val + hexa;
			else if(n == 10) hexa = 'A' + hexa;
			else if(n == 11) hexa = 'B' + hexa;
			else if(n == 12) hexa = 'C' + hexa;
			else if(n == 13) hexa = 'D' + hexa;
			else if(n == 14) hexa = 'E' + hexa;
			else hexa = 'F' + hexa;
			n /= 16;
		}
		System.out.println(hexa);
	}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number to convert to hexadecimal: ");
		int a = sc.nextInt();
		sc.close();
		
		toHexa(a);
	}


}
