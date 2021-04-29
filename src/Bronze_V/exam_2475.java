package Bronze_V;

import java.util.Scanner;
public class exam_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			int in = sc.nextInt();
			
			result += (in * in);
		}
		
		System.out.println(result % 10);
	}

}
