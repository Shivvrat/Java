package begginer;

import java.util.Scanner;

public class ANKTRAIN {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		String ans = "";
		for (int count = 0; count < T; count++) {
			int N = Integer.parseInt(scan.nextLine());
			int mod = N % 8;
			if (mod == 0) {
				mod = 8;
			}
			int x = N / 8;

			if (mod == 8) {
				ans = (x * 8 - 1) + "SL";
			}
			if (mod == 7) {
				ans = (x * 8 + 8) + "SU";
			}

			if (mod == 1) {
				ans = (x * 8 + 4) + "LB";
			}
			if (mod == 4) {
				ans = (x * 8 + 1) + "LB";
			}
			if (mod == 3) {
				ans = (x * 8 + 6) + "UB";
			}
			if (mod == 6) {
				ans = (x * 8 + 3) + "UB";
			}

			if (mod == 5) {
				ans = (x * 8 + 2) + "MB";
			}
			if (mod == 2) {
				ans = (x * 8 + 5) + "MB";
			}
			System.out.println(ans);
		}
	}

}
