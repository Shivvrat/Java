package begginer;

import java.util.Scanner;

public class FLOW001 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			System.out.println(Integer.parseInt(scan.next())+Integer.parseInt(scan.next()));
		}
	}
}
