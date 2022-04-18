package BankAccount;

public class Account {
	private int accountNo;
	private String name;
	private float amount;
	
	
	
	public void insert(int a, String n, float amt ) {
		this.accountNo = a;
		this.name = n;
		this.amount = amt;
	}
	public void deposit(float amt) {
		this.amount += amt;
		System.out.println(amt + " deposit");
	}
	public void withdraw(float amt) {
		if (this.amount < amt) {
			System.out.println("You don't have enough Money to withdraw");
		}else { 
			this.amount -= amt;
			System.out.println(amt + " withdraw");
		}
	}
	public void checkBalance() {
		System.out.println("Balance = " + this.amount);
	}
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
}
