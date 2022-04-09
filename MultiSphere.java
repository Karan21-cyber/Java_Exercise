package Lab4;

public class MultiSphere extends Sphere {

	public MultiSphere(double diameter) {
		super(diameter);
		}

	public static void main(String[] args) {	
		MultiSphere sp = new MultiSphere(12);	
		System.out.println("Diameter: "+sp.getDia());
		System.out.println("Radius:"+sp.getDia()/2);
		System.out.println("Surface area: "+sp.calculateArea(sp.getDia()));
		System.out.println("Volume of sphere: "+sp.calculateVol(sp.getDia()));
		
		System.out.println(sp.toString());
	}

}
