package Hospital;

public class driver{
	
	public static void main(String[] args) {
		Doctor dr = new Doctor("Dipesh",1122,"Dentiest");
		Nurse nr = new Nurse("Alina",2211,120);
		Cleaner cr = new Cleaner("Ravi",1022,"Mortury");
		Receptionist rs = new Receptionist("Silpa",1220,100);
		
		System.out.println("Doctor : "+dr.gerName()+", Id : "+dr.getemp_id()+", specializes in "+dr.getspec());
		System.out.println("Nurse : "+nr.gerName()+", Id : "+nr.getemp_id()+", has "+nr.getPatient()+" patients");
		System.out.println("Cleaner : "+cr.gerName()+" Id: "+cr.getemp_id()+", of "+cr.getdepat()+" is sweeping");
		System.out.println("Receptionist : "+rs.gerName()+" Id: "+rs.getemp_id()+", has "+rs.getcustomer()+" no of customre");
	}

}
