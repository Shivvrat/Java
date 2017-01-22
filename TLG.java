package begginer;

import java.util.Scanner;

public class TLG {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.next());
		int max = 0;
		int player = 0;
		for (int a = 0; a < num; a++) {
			int p1 = Integer.parseInt(scan.next());
			int p2 = Integer.parseInt(scan.next());
			if (max < Math.abs(p1 - p2)) {
				if (p1 > p2) {
					player = 1;
			
						max = p1 - p2;
					
				} else {
					player = 2;
					
						max = p2 - p1;
					
				}
			}
		}
		System.out.print(player + " " + max);
	}
}
