package Lab3;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int die1,die2;
		String[] roll = {"first","second","third"};
		System.out.print("How many sides does die 1 have? ");
		die1 = scan.nextInt();
		System.out.print("How many sides does die 2 have? ");
		die2 = scan.nextInt();
		
		int total1 = 0;
		int total2 = 0;
		for(int i =0; i < 3;i++) {
			
			int randRoll1 = rand.nextInt(die1);
			int randRoll2 = rand.nextInt(die2);
			System.out.println("Die 1 " + roll[i] +" roll "+ randRoll1);
			System.out.println("Die 2 " + roll[i] +" roll "+ randRoll2);
			total1 += randRoll1;
			total2 += randRoll2;
		}
		
		System.out.println("Die1 rolled a total of " + total1 +" and rolled "+ total1/3 +" on average." );
		System.out.println("Die2 rolled a total of " + total2 +" and rolled "+ total2/3 +" on average." );	
	}

}
