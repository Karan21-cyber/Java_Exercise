package Lab2;
import java.io.*;
public class Reverse {

	public static void main(String[] args)throws Exception {
		String sentence;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		sentence = br.readLine();
		
		int length = sentence.length();
		while(length >0) {
			System.out.print(sentence.charAt(length-1));
		length--;
		}
	}

}
