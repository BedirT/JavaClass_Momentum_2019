// 2nd Class 3rd Part

public class ClassesInJava {

	public static int getSum(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public static int getDiff(int a, int b){
		// Complete the class given
		int diff = a - b;
		return diff;
	}
	
	public static void main(String[] args) {
		int i, j;
		i = 1;
		j = 2;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("sum = " + getSum(i, j));
		System.out.println("diff = " + getDiff(i, j));
	}

}
