package Bronze_V;

import java.util.Scanner;

public class exam_2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int i = sc.nextInt();
		
		int result = cnt * (i - 1) + 1;
		System.out.println(result);
	}

}
