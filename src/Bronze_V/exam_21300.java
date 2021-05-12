package Bronze_V;

import java.util.Scanner;
public class exam_21300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		for(int i = 0; i <= 5; i++) {
			int answer = sc.nextInt();
			money += answer;
		}
		
		System.out.println(money * 5);
	}

}
