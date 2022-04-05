package Lab3;

import java.util.Scanner;
import java.text.DecimalFormat;
public class sphere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("##.####");
		
		double radius;
		double volume;
		double area;
		double pi = 3.14;
		System.out.print("Enter the radius of sphere : ");
		radius = scan.nextDouble();
		
		volume = (4*pi*Math.pow(radius, 3))/3;
		area = 4*pi*Math.pow(radius, 2);
		System.out.println();
		System.out.println("Volume of the sphere: "+fmt.format(volume));
		System.out.println("SUrface area of sphere: "+ fmt.format(area));
	}

}
