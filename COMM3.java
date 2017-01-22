package begginer;

import java.util.Scanner;

public class COMM3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for (int count1 = 0; count1 < T; count1++) {
			int range = scan.nextInt();
			int a[][] = new int[3][3];
			boolean ans1 = true,ans2 = true,ans3 = true;
			for (int count2 = 0; count2 < 3; count2++) {
				a[count2][0] = Integer.parseInt(scan.next());
				a[count2][1] = Integer.parseInt(scan.next());
			}
			if (minDis(a, 0, 1) >= range) {
				ans1 = false;
				
			} else if (minDis(a, 0, 2) >= range) {
				ans2 = false;
				
				
			} else if (minDis(a, 1, 2) >= range) {
				ans3 = false;
				
			}
			
			if(ans1==true&&ans2==true||ans3==true&&ans2==true||ans1==true&&ans3==true)
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}

	static int  minDis(int a1[][], int x, int y) {
		return (int)Math.floor( Math.sqrt(Math.pow(a1[x][0] - a1[y][0], 2) + Math.pow(a1[x][1] - a1[y][1], 2)));
	}

}
