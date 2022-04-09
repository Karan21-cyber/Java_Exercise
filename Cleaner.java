package Hospital;
import java.util.Scanner;
public class Cleaner {
	Scanner scan = new Scanner(System.in);
	String name;
	int emp_id;
	String department;
	
	public Cleaner()
	{
		
	}
	public Cleaner(String name,int emp_id,String department) {
		this.name = name;
		this.emp_id = emp_id;
		this.department = department;
		
 	}

	public String gerName() {
		return name;
	}

	public int getemp_id() {
		return emp_id;
	}

	public String getdepat() {
		return department;
	}
	

}
