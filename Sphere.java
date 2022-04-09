package Lab4;

public class Sphere {
	double diameter;
	double volume;
	double area;
	double pi = 3.14;
	
	public  Sphere(double diameter) {
		this.diameter = diameter;
	}
	
	public double getDia() {
		return diameter;
	}
	
	public double calculateVol(double diameter) {
		double radius = diameter/2;
		volume = (4*pi*Math.pow(radius, 3))/3;
		return volume;
	}
	
	public double calculateArea(double diameter) {
		double radius = diameter/2;
		area = 4*pi*Math.pow(radius, 2);
		return area;
	}
	
	public  String toString() {
		return "This is the Sphere class which calculate the surface area and volume of sphere.";
		
	}
	
}
