package begginer;

import java.util.Arrays;
import java.util.Scanner;

public class SMPAIR {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int N = Integer.parseInt(scan.next());
			int[] array = new int[N];
			for (int count2 = 0; count2 < N; count2++) {
				array[count2]=Integer.parseInt(scan.next());
			}
			Arrays.sort(array);
			System.out.println(array[0]+array[1]);
		}
	}

}
