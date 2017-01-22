package begginer;

import java.util.Scanner;

class TEST {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (scan.hasNext()) {
			
			if(num!=42)
			{num = Integer.parseInt(scan.nextLine());
			if(num!=42)
			System.out.println(num);
			}
		}
		scan.close();
	}
}
