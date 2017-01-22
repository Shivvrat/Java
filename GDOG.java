package begginer;

import java.util.Scanner;

public class GDOG {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int N = Integer.parseInt(scan.next());
			int  K = Integer.parseInt(scan.next());
			int max = 0;
			for(int count2=1;count2<=K;count2++){
				if(N%count2>max){
					max = N%count2;
				}
			}
			System.out.println(max);
		}
	}
}
