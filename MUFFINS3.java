package begginer;

import java.util.Scanner;

public class MUFFINS3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.next());
		for (int count = 0; count < t; count++) {

			int num = Integer.parseInt(scan.next());
			if(num == 2 )
			System.out.println("2");
			else
				System.out.println(num/2+1);
		}
	}
}
