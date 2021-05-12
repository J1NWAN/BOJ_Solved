package Bronze_IV;

// 피타고라스 정리와 제곱근 구하는법 알아야 풀 수 있다.
import java.util.Scanner;
public class exam_1297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tv = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		long rr = r * r;
		long cc = c * c;
		long tv2 = tv * tv;
		
		double ans = (double)tv2 / (double)(rr + cc);
		System.out.println((int)Math.sqrt(ans * rr) + " " + (int)Math.sqrt(ans * cc));
	}

}
