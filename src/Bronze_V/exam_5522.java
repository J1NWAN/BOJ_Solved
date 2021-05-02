package Bronze_V;

import java.util.Scanner;
public class exam_5522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ai, joi = 0;
		
		for(int i = 0; i < 5; i++) {
			ai = sc.nextInt();
			
			if(0 <= ai && ai <= 100) {
				joi += ai;
			}
		}
		System.out.println(joi);
	}

}
