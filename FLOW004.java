package begginer;

import java.util.Scanner;

public class FLOW004 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for (int count1 = 0; count1 < T; count1++) {
			int N = Integer.parseInt(scan.next());
			String s = Integer.toString(N);
			int sum = s.charAt(0)+s.charAt(s.length()-1);
			System.out.println(sum-96);
		}
	}

}
