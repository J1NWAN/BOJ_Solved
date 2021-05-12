package Bronze_V;

import java.util.Scanner;
public class exam_20492 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int money = sc.nextInt();
		int a =  money - (money * 22) / 100; // 1번 방법
		
		// 2번 방법
		int b = money - (money * 80) / 100;
		int c = (b * 22) / 100; 
		
		System.out.println(a);
		System.out.println(money - c);
	}

}
