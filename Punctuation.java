package Lab2;
import java.io.*;

public class Punctuation {

	  public static void main (String [] args) throws Exception {  
	        //Stores the count of punctuation marks  
	        int countPuncMarks = 0;  
	        String str;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the String: ");
			str = br.readLine();
			
	        for (int i = 0; i < str.length(); i++) {  
	                //Checks whether given character is punctuation mark  
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
	                countPuncMarks++;  
	                         }  
	        }  
	       
	        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
	    }  
}
