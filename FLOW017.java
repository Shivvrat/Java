package begginer;

import java.util.Arrays;
import java.util.Scanner;

public class FLOW017 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int[] num = new int[3];
			for(int count2=0;count2<3;count2++){
				num[count2]=Integer.parseInt(scan.next());
				}
			Arrays.sort(num);
			System.out.println(num[1]);
		}
	}

}
