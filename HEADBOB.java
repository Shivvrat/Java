package begginer;

import java.util.Scanner;

public class HEADBOB {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int count1 = 0; count1 < T; count1++) {
			int N = scan.nextInt();
			scan.nextLine();
			String s = scan.nextLine();
			boolean ans = false;
			char[]  p=s.toCharArray();
			for(int x = 0;x<s.length();x++){
				if(p[x]=='Y'){
					System.out.println("NOT INDIAN");
					ans = true;
					break;
				}
				else if(p[x]=='I'){
					System.out.println("INDIAN");
					ans = true;
					break;
				}
			}
			if(ans==false){
				System.out.println("NOT SURE");
			}
		}
	}

}
