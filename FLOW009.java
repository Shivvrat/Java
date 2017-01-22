package begginer;

import java.util.Scanner;

public class FLOW009 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int q = Integer.parseInt(scan.next());
			int p = Integer.parseInt(scan.next());
			if(q<1000){
				System.out.printf("%.6f" ,(double)q*p);
				System.out.println();
			}
			else{
				System.out.printf("%.6f" ,(double)q*p-q*p/10);
				System.out.println();
			}
		}
	}
}