package begginer;

import java.util.Scanner;

public class FLOW008 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int N = Integer.parseInt(scan.next());
			if(N<10){
				System.out.println("What an obedient servant you are!");
			}
			else{
				System.out.println("-1");
			}
		}
	}
}
