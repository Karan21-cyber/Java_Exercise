package Lab1;
import java.util.Scanner;
public class Miles_to_Kilometers {

	public static void main(String[] args) {
		float m = 1.60935f;
		float miles;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mile : ");
		miles = scan.nextFloat();
		float km = miles*m;
		System.out.println("Kilometer is : "+km);
	}
}
