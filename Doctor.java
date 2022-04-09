package Hospital;
import java.util.Scanner;
public class Doctor {
	Scanner scan = new Scanner(System.in);
	String name;
	int emp_id;
	String specialism;
	
	public Doctor()
	{
		
	}
	public Doctor(String name,int emp_id,String specialism) {
		this.name = name;
		this.emp_id = emp_id;
		this.specialism = specialism;
		
 	}
	
	public String gerName() {
		return name;
	}

	public int getemp_id() {
		return emp_id;
	}

	public String getspec() {
		return specialism;
	}
	
}
