package Lab4;
import java.util.Scanner;
public class Transaction extends Account {

	public Transaction(String accountName, String accountNo, double balance) {
		super(accountName, accountNo, balance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String number;
		double balance;
		System.out.print("Enter your Name: ");
		name = scan.nextLine();
		System.out.print("Enter account number:  ");
		number = scan.next();
		System.out.print("Enter Initial Balance: ");
		balance = scan.nextDouble();
		
		Transaction ac = new Transaction(name,number,balance);
		System.out.println();
		ac.display();
		System.out.println();
		System.out.println(ac.toString());
		
	}

}
