package begginer;

import java.util.Arrays;
import java.util.Scanner;

public class TSORT {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		int[] sort = new int[t];
		for (int count = 0; count < t; count++) {
			sort[count]=Integer.parseInt(scan.nextLine());
		}
		Arrays.sort(sort);
		for (int count = 0; count < t; count++) {
			System.out.println(sort[count]);
		}
	}
}
