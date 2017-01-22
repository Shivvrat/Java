
package begginer;

import java.util.Scanner;

public class QUES {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if(N%2==0){
		int[][] a = new int[N][N];
		int ans = 1;
		int b = 1;
		int one = 0;
		int two = 0;

	while(two<=N-1||one<=N-1){
			for (int count2 = 0; count2 < N; count2++) {

				if (ans % 2 == 1) {
					if(two<=N/2-1)
					{a[two][count2] = b;
					
					b++;}
					if (count2 == N - 1)
						{ans++;
					two++;
					}
				} else {
					if(one<=N/2-1)
					{a[N - one-1][count2] = b;
				
				
					b++;}
					
					if (count2 == N - 1)
						{ans++;
						one++;
						}

				}
			}
		}
		for (int count1 = 0; count1 < N; count1++) {
			for (int count2 = 0; count2 < N; count2++) {
				System.out.print(a[count1][count2]+" ");
			}
			System.out.println();
		}
	}
		else{
			int[][] a = new int[N][N];
			int ans = 1;
			int b = 1;
			int one = 0;
			int two = 0;

		while(two<=N-1||one<=N-1){
				for (int count2 = 0; count2 < N; count2++) {

					if (ans % 2 == 1) {
						if(two<=N/2)
						{a[two][count2] = b;
						
						b++;}
						if (count2 == N - 1)
							{ans++;
						two++;
						}
					} else {
						if(one<=N/2-1)
						{a[N - one-1][count2] = b;
					
					
						b++;}
						
						if (count2 == N - 1)
							{ans++;
							one++;
							}

					}
				}
			}
			for (int count1 = 0; count1 < N; count1++) {
				for (int count2 = 0; count2 < N; count2++) {
					System.out.print(a[count1][count2]+" ");
				}
				System.out.println();
			}
		}
		}
	

}
