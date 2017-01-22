package begginer;
import java.util.Scanner;

public class PRB01 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for(int count1=0;count1<T;count1++){
			int N = Integer.parseInt(scan.next());
			boolean ans = false;
			for(int count2=2;count2<N;count2++){
				if(N%count2==0){
					System.out.println("no");
					ans=true;
					
					break;
				}
			}
			if(ans==false){
				System.out.println("yes");
			}
		}
	}

}
