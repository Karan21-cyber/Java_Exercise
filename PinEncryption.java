package Lab3;
import java.util.*;
public class PinEncryption {

	public static void main(String[] args) {
		int num,num1,num2;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter a 4 digit pin number to encrypt: ");
		num = scan.nextInt();
		String hex = Integer.toHexString(num);
		
		num1 = rand.nextInt(1000,6556);
		num2 = rand.nextInt(1000,6556);
		String hex1 = Integer.toHexString(num1);
		String hex2 = Integer.toHexString(num2);
		
		System.out.println("Your encrypted pin number is "+ hex1+hex+hex2+".");
	}
}
