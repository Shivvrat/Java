package begginer;

import java.util.Scanner;

public class FLOW006 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for(int count2 = 0;count2 < T;count2++){
			int n = Integer.parseInt(scan.next());
			int sum = 0;
			while(n!=0)
			{sum = sum + n%10;
			n = n / 10;}
			System.out.println(sum);
		}
	}

}
