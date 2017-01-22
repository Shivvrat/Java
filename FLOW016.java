package begginer;

import java.util.Scanner;

public class FLOW016 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());
			int max = 1;
			if (a > b) {
				for (int count2 = 2; count2 < b; count2++) {
					if(a%count2==0&&b%count2==0){
						max = count2;
					}
				}
			}
			else{
				for (int count2 = 2; count2 < a; count2++) {
					if(a%count2==0&&b%count2==0){
						max = count2;
					}
				}
			}
			System.out.print(max+" " +a*b/max);
			System.out.println();
		}
	}

}
