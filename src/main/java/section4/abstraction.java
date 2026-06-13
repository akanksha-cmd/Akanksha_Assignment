package section4;

abstract class Account{
	
	 int accountNumber;
	 int balance;
	 
     abstract void withdraw();
     
     public void deposit() {
	 System.out.println("Amount deposited successfully.");
 }
}

class SavingsAccount extends Account{
	 void withdraw() {
		System.out.println("Amount withdrawn from Savings Account.");
	}
}
class CurrentAccount extends SavingsAccount{
	void withdraw() {
		System.out.println("Amount withdrawn from Current Account.");
	}

}

public abstract class abstraction {
	
	public static void main(String[] args) {
		SavingsAccount save = new SavingsAccount();
		save.deposit();
		save.withdraw();
		CurrentAccount save1 = new CurrentAccount();
		save1.withdraw();
		//save1.withdraw();

	}
}

