package Bronze_IV;

import java.util.Scanner;
public class exam_1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		String num = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num.length(); i++) {
			int cur = num.charAt(i) - '0';
			
			if(i == 0 && cur < 4) {
				if(cur < 2) { // 0, 1인 경우 앞의 두자리('00') 잘라주기
					sb.append(binary[cur].substring(2));
				} else { // 2,3인 경우 앞의 한 자리 ('0') 잘라주기
					sb.append(binary[cur].substring(1));
				}
			} else {
				sb.append(binary[cur]);
			}
		}
		
		System.out.println(sb.toString());
	}

}
