package Lab1;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int length;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		length = scan.nextInt();
		double square = Math.pow(length,2);
		double parimeter = 4*length;
		System.out.println("parimeter of square is : "+parimeter);
		System.out.println("Area of square is : "+square);
	}

	
	}


