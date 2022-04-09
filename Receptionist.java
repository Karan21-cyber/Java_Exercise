package Hospital;

import java.util.Scanner;

public class Receptionist {
	
	Scanner scan = new Scanner(System.in);
	String name;
	int emp_id;
	int no_customers;
	
	public Receptionist()
	{
		
	}
	public Receptionist(String name,int emp_id,int no_patient) {
		this.name = name;
		this.emp_id = emp_id;
		this.no_customers = no_patient;
		
 	}
	
	public String gerName() {
		return name;
	}
	
	public int getemp_id() {
		return emp_id;
	}
	
	public Integer getcustomer() {
		return no_customers;
	}
	
}
	

