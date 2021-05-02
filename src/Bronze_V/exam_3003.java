package Bronze_V;

import java.util.Scanner;

public class exam_3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] result = { 1, 1, 2, 2, 2, 8 };
		int[] chess = new int[6];

		for (int i = 0; i < chess.length; i++) {
			chess[i] = sc.nextInt();
		}
		
		for(int i = 0; i < chess.length; i++) {
			System.out.print(result[i] - chess[i] + " ");
		}
	}

}
