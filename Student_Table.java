package Lab1;

/*
 * This Program is to store the details of the student and prints the data
 * First it will ask the user to input the number of student to store data
 */

import java.io.*;
import java.util.*;
public class Student_Table {

	public static void main(String[] args)throws Exception {
		String name;
		int lab,bonus;
		int i,num ;
		
		// Creating new lists objects
		List<String> nms = new ArrayList<>();
		List<Integer> labs = new ArrayList<>();
		List<Integer> bns = new ArrayList<>();
		List<Integer> total = new ArrayList<>();
		
		// creating object 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of people to get the Table: ");
		num = Integer.parseInt(br.readLine());
		
		// this will loop the number of student details and store the data in the list
		for(i = 1; i <= num ;i++) {
			System.out.print("Enter your name: ");
			name = br.readLine();
			nms.add(name);
			
			System.out.print("Enter your Lab Marks: ");
			lab = Integer.parseInt(br.readLine());
			labs.add(lab);
			
			System.out.print("Enter your Bonus Marks: ");
			bonus = Integer.parseInt(br.readLine());	
			bns.add(bonus);
			
			System.out.println("Data Entered Successfully");
			System.out.println("");	
		}
		
		// Creating the Table
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		
		System.out.println("");
		System.out.println("Name"+"\t\t"+"Lab"+"\t"+"Bonus"+"\t"+"Total");
		System.out.println("----\t\t---\t-----\t-----");
		
		// this will return the output from the list
		for(i = 0; i <= num;i++) {
			int sum = labs.get(i)+bns.get(i);
			total.add(sum);
			System.out.println(nms.get(i)+"\t\t"+labs.get(i)+"\t"+bns.get(i)+"\t"+total.get(i));
		}		
	}
}
