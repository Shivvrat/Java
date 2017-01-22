package begginer;

import java.util.Scanner;

public class KIRLAB {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count = 0; count < T; count++) {
			int ans = 1;
			int num = Integer.parseInt(scan.next());
			int[] val = new int[num];
			for (int count2 = 0; count2 < num; count2++) {
				val[count2] = Integer.parseInt(scan.next());
			}
			boolean first = true;
			int lastCount = 0;
			int maxAns = 0;
			for (int count4 = 0; count4 < num; count4++) {
				ans=1;
				
				for (int count3 = count4; count3 < num; count3++) {
					if (count3 < num - 1 && gcd(val[count3], val[count3 + 1]) != 1) {
						ans++;
						first = false;
						lastCount = count3 + 1;

					} else if (count3 < num - 2 && gcd(val[count3], val[count3 + 2]) != 1) {
						ans++;
						count3++;
						first = false;
						lastCount = count3 + 2;

					} else if (first == false) {
						break;
					}
					
				}
				if(ans>maxAns){
					maxAns=ans;
				}
			}
			System.out.println(maxAns);
		}

	}

	static int gcd(int a, int b) {
		while (a != 0 && b != 0) // until either one of them is 0
		{
			int c = b;
			b = a % b;
			a = c;
		}
		return a + b; // either one is 0, so return the non-zero value
	}
}
