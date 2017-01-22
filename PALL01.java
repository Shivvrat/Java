package begginer;
import java.util.Scanner;
public class PALL01 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for(int count1 = 0;count1<T;count1++){
			String s = scan.next();
		
			StringBuilder s2 = new StringBuilder(s);
			s2.reverse();
			String s3 = new String(s2);
			if(s.equals(s3)){
				System.out.println("wins");
			}
			else{
				System.out.println("losses");
			}
		}
	}
}
