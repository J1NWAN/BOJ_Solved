package Bronze_V;

import java.util.Scanner;

public class exam_20254 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ur = sc.nextInt(), tr = sc.nextInt(), uo = sc.nextInt(), to = sc.nextInt();
		int result = (ur * 56) + (tr * 24) + (uo * 14) + (to * 6);
		System.out.println(result);
	}

}
