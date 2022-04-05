package Lab1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		 float val1, val2, val3;
	     float average;
	       Scanner scan = new Scanner(System.in) ;

	       // get three values from user
	       System.out.println("Please enter three integers and " +"I will compute their average");
	       System.out.println("Enter the first value: ");
	       val1 = scan.nextInt();
	       System.out.println("Enter the first value: ");
	       val2 = scan.nextInt();
	       System.out.println("Enter the first value: ");
	       val3 = scan.nextInt();
	       average = (val1+val2+val3)/3;
	       System.out.println("The average is: "+ average);      
	}
}
