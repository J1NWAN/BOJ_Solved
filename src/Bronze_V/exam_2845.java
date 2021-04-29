package Bronze_V;

import java.util.Scanner;

public class exam_2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int P = sc.nextInt();
		int result = L * P;
		
		int[] human = new int[5];
		
		for(int i = 0; i < 5; i++) {
			human[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(human[i] - result + " ");
		}
	}

}
