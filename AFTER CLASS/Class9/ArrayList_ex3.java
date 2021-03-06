import java.util.ArrayList;

public class ArrayList_ex3 {

	// Implement the method deleteEven that 
	// removes the elements with even values 
	// from the original ArrayList.
	
	public static void deleteEven(ArrayList<Integer> a) {
		
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) % 2 == 0) {
				a.remove(i);
				i--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		System.out.println(A); // output: [1, 2, 3, 4, 5]

		deleteEven(A);

		System.out.println(A); // output: [1, 3, 5]

	}

	
}
