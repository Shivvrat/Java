package begginer;

import java.util.Arrays;
import java.util.Scanner;

public class RECIPE {
	public static void main(String args) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for(int count1=0;count1<T;count1++){
			int N = Integer.parseInt(scan.nextLine()); 
			int[] req = new int[N];
			for(int count2=0;count2<N;count2++){
				req[count2]= Integer.parseInt(scan.nextLine());
			}
			int max = 0;
			Arrays.sort(req);
			for(int count3=0;count3<req[N];count3++){
				for(int count4=0;count4<N-1;count4++){
				if(gcd(req[count4],req[count4+1])!=count3){
					break;
					
				}
				}
				continue;
			}
			
			
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
