package Bronze_V;

import java.math.BigInteger;
import java.util.Scanner;
public class exam_8437 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		BigInteger two = new BigInteger("2");
		sc.close();
		
		System.out.println(a.add(b).divide(two));
		System.out.println(a.subtract(b).divide(two));
	}

}
