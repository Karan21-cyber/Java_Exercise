package Lab4;

public class Account {

	String accountName, accountNo;
	double balance = 0;
	
	public Account(String accountName, String accountNo, double balance)
	{
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.balance = balance;
	}
		
	public String getAccNam() {
		return accountName;
	}
	public String getAccNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	
	public void display() {
		System.out.println("Account Name: "+ getAccNam());
		System.out.println("Account Number: "+ getAccNo());
		System.out.println("Account Balance: "+getBalance());
	}
	public String toString() {
		return "Thank You for creating new Account";
	}
	
}
