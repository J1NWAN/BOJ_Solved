package Bronze_V;

import java.util.Scanner;
public class exam_5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int second = 0;
		
		for(int i = 0; i < 4; i++) {
			second += sc.nextInt();
		}
		sc.close();
		
		System.out.println(second/60);
		System.out.println(second%60);
	}
}
