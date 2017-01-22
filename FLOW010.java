package begginer;

import java.util.Scanner;

public class FLOW010 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for (int count1 = 0; count1 < T; count1++) {
			String s = scan.next();
			if(s.equals("B")||s.equals("b")){
				System.out.println("BattleShip");
			}
			else if(s.equals("c")||s.equals("C")){
				System.out.println("Cruiser");
			}
			else if(s.equals("d")||s.equals("D")){
				System.out.println("Destroyer");
			}
			else if(s.equals("f")||s.equals("F")){
				System.out.println("Frigate");
			}	
		}
		

	}

}
