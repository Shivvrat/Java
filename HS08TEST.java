package begginer;
import java.util.Scanner;

public class HS08TEST {
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	double y = scan.nextDouble();
	double bal = 0;
	if(x%5==0&&y-0.50>x){
		bal = y-x-0.50;
	}
	else{
		bal = y;
		
	}
	System.out.printf("%.2f",bal);
	}
}
