package Lab3;

public class StringPlay {

	public static void main(String[] args) {
		String college = new String("Leeds Beckett University");
		String town = new String ("Anytown, UK");
		
		int stringLength;
		String change1, change2, change3;
		
		stringLength = college.length();
		
		System.out.println(college + " contains " + stringLength +" characters.");
		change1 = college.toUpperCase();
		change2 = change1.toLowerCase().replace("e's", "*");
		change3 = change2+town;
		
		System.out.println("The final string is "+ change3);

	}

}