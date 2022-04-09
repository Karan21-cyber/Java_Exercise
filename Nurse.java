package Hospital;
import java.util.Scanner;
public class Nurse {
	
	Scanner scan = new Scanner(System.in);
	String name;
	int emp_id;
	int no_patient;
	
	public Nurse()
	{
		
	}
	public Nurse(String name,int emp_id,int no_patient) {
		this.name = name;
		this.emp_id = emp_id;
		this.no_patient = no_patient;
		
 	}
	
	public String gerName() {
		return name;
	}

	public int getemp_id() {
		return emp_id;
	}

	public Integer getPatient() {
		return no_patient;
	}
	

}
