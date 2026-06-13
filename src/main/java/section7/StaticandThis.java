package section7;

class BankAccount{
	// static variable
	static String bankName = "HDFC";
	// instance variable
	String accountNumber;
	double balance;
	// constructor
	BankAccount(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	// method
	public void accounts() {
		System.out.println("Bank Name is " + bankName);	
		System.out.println("Account number is "+ accountNumber);
		System.out.println("Balance is " + balance);
	}
}

public class StaticandThis {
	public static void main (String[] args) {
	BankAccount user1 = new BankAccount("HDFC93783838", 50000.00);
	user1.accounts();
	
	BankAccount user2 = new BankAccount("HDFC87383738", 100000.00);
	user2.accounts();

}
	}
