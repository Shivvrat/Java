package begginer;

import java.util.Scanner;

public class FLOW007 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(scan.nextLine());
		for (int count1 = 0; count1 < T; count1++) {
			String s = scan.nextLine();
			sb = new StringBuilder(s);
			sb.reverse();
			System.out.println(new String(sb));
		}
	}

}
