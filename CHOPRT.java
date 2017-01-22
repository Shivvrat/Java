package begginer;

import java.util.Scanner;

public class CHOPRT {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			int A = Integer.parseInt(scan.next());
			int B = Integer.parseInt(scan.next());
			if(A>B) 
			System.out.println(">");
			else if(B>A)
			System.out.println("<");
			else
				System.out.println("=");
		}
	}

}
