package Jan;

import java.util.Scanner;

public class CATSDOGS {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int count1 = 0; count1 < T; count1++) {
			long c = scan.nextLong();
			long d = scan.nextLong();
			long l = scan.nextLong();
			boolean ans = false;
			if (l % 4 != 0) {
				ans = false;
				
			} else {
				if (l < 4 * d || l > 4 * d + 4 * c || l == 0 && d == 0 && c != 0) {
					ans = false;
				
				} else {
					ans = true;
			
				}
				if (2*d < c && l < 4*d + 4 * (c - 2*d)) {
					ans = false;
					
				}
			}
			if (ans == true)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
