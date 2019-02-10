// 2nd Class 1st Part

public class Operators {

	public static void main(String[] args) {

		// Arithmetic Operators
		// +, -, *, /, %, ++, --
		System.out.println(3 + 4);
		System.out.println(5 - 3);
		System.out.println(3 * 5);
		System.out.println(15 / 3);
		System.out.println(11 % 3);
		
		int a = 3;
		a++;
		System.out.println(a);
		System.out.println(++a);
		
		a--;
		System.out.println(a);
		System.out.println(--a);
		
		// Relational Operators
		// ==, !=, <, >, <=, >=
		int b = 5;
		int c = 6;
		
		// Equal - ==
		System.out.println(b == c);
		System.out.println(5 == 5);
		
		// Not equal - !=
		System.out.println(5 != 5);
		
		// Greater than - >
		System.out.println(c > b);
		
		// Greater than or equal to - >=
		System.out.println(4 >= 4);
		
		// Less than - <
		System.out.println(4 < 3);
		
		// Less than or equal to - <=
		System.out.println(3 <= 6);
		System.out.println(3 <= 3);
		
		// Bitwise Operators
		// & - Bitwise and
		System.out.println(10 & 2);
		
		// | - Bitwise or
		System.out.println(10 | 2);
		System.out.println(0x10);
		
		// ^ - Bitwise XOR
		System.out.println(10 ^ 2);
		
		// ~ - Bitwise Compliment
		System.out.println(~2);
		System.out.println(~0b01);
		
		// << - Left Shift
		System.out.println(5 << 1);
		
		// >> - Right Shift
		System.out.println(6 >> 1);
		
		// Logical Operators
		// &&, ||, !
		// &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// ||
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(true || true);
		System.out.println(false || true);
		
		// !
		System.out.println(!false);
		System.out.println(!true);
		
		// Assignment Operator
		// =
		int number3 = 3;
		
	}

}
