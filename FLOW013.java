package begginer;

import java.util.Scanner;

public class FLOW013 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int a=Integer.parseInt(scan.next());
			int b=Integer.parseInt(scan.next());
			int c=Integer.parseInt(scan.next());
		if(a+c+b==180&&a!=0&&b!=0&&c!=0){
			System.out.println("YES");
		}
			else{
				System.out.println("NO");
			}
		}
	}

}
