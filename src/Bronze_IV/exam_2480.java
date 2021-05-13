package Bronze_IV;

import java.util.Scanner;

public class exam_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diceOne = sc.nextInt();
		int diceTwo = sc.nextInt();
		int diceThree = sc.nextInt();
		int max = 0; // 첫 풀이에만 사용

		// 처음 풀었던 방법
		/*
		 * if(diceOne == diceTwo && diceOne == diceThree && diceTwo == diceThree) {
		 * System.out.println(10000+(diceOne * 1000)); } else if (diceOne != diceTwo &&
		 * diceOne != diceThree && diceTwo != diceThree){ max = Math.max(diceOne,
		 * Math.max(diceTwo, diceThree));
		 * 
		 * System.out.println(max * 100); } else { if(diceOne == diceTwo) {
		 * System.out.println(1000 + (diceOne * 100)); } else if(diceOne == diceThree) {
		 * System.out.println(1000 + (diceOne * 100)); } else { System.out.println(1000
		 * + (diceThree * 100)); } }
		 */

		// 두 번째 풀었던 방법

		if (diceOne == diceTwo && diceOne == diceThree && diceTwo == diceThree) {
			System.out.println(10000 + (diceOne * 1000));
			
		} else if (diceOne == diceTwo || diceOne == diceThree) {
			System.out.println(1000 + (diceOne * 100));
			
		} else if (diceTwo == diceThree) {
			System.out.println(1000 + (diceTwo * 100));
			
		} else {
			System.out.println(Math.max(diceOne, Math.max(diceTwo, diceThree)) * 100);
		}

	}

}
