package entities;

public class Customer{
	
	private int accountNum;
	private String personName;
	private double balance;
	private static final double TAX = 5.00; 
	
	public Customer(int accountNum, String personName, double initialDeposit) {
		this.accountNum = accountNum;
		this.personName = personName;
		this.balance = initialDeposit; 
	}
	
	public Customer(int accountNum, String personName) {
		this.accountNum = accountNum;
		this.personName = personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getTAX() {
		return TAX;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX;
		}
 
	
	@Override
	public String toString() {
		return "Account "
				+ accountNum
				+ ", "
				+ "Holder: "
				+ personName
				+ ", "
				+ "Balance: $ "
				+ String.format("%.2f", balance);
	}
}
