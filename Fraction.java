package Lab1;
import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		int num,den;
		float fract = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator: ");
		num = scan.nextInt();
		System.out.println("Enter denominator : ");
		den = scan.nextInt();
		
		fract = num/den;
		System.out.println("Fration is : "+ fract);
	
	}

}
 