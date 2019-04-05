import java.util.Scanner;

public class arrays_ex3 {

	public static void main(String[] args) {
		// - Get 5 strings from user 
		// - Print out all the possible combinations with the
		// 		given strings.
		Scanner sc = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0 ;i < 5; i++) {
			words[i] = sc.nextLine();
		}
		for(int i = 0 ;i < 5; i++) {
			System.out.println(words[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) continue;
				for(int k = 0; k < 5; k++) {
					if(i == k || j == k) continue;
					for(int m = 0; m < 5; m++) {
						if(i == m || j == m || k == m) continue;
						for(int n = 0; n < 5; n++) {
							if(i == n || j == n || k == n || m == n) continue;
							System.out.println(words[i] + " " + words[j] + " " + words[k] + " " + words[m] + " " + words[n]);
						}
					}
				}
			}
		}
		
	}

}
