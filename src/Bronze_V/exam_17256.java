package Bronze_V;
import java.util.Scanner;

public class exam_17256 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ax = sc.nextInt(), ay = sc.nextInt(), az = sc.nextInt();
		int cx = sc.nextInt(), cy = sc.nextInt(), cz = sc.nextInt();
		
		System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));
	}

}
