package Bronze_V;

import java.util.Scanner;
public class exam_17496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 총 일수
		int T = sc.nextInt(); // 자라는데 걸리는 일
		int C = sc.nextInt(); // 심을 수 있는 칸의 수
		int P = sc.nextInt(); // 개당 가격
		
		if(N % T == 0) {
			N--;
		}
		int total = ((N/T) * C) * P;
		
		System.out.println(total);
	}

}
