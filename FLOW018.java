package begginer;

import java.util.Scanner;

public class FLOW018 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int N = Integer.parseInt(scan.next());
			System.out.println(fact(N));

		}
	}

	static int fact(int N) {
		int ans = 1;
		for (int count1 = 2; count1 <= N; count1++) {
			ans = ans * count1;
		}
		return ans;
	}

}
