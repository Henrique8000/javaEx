package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Customer;

public class HrqBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountName = sc.nextLine();
	
		System.out.print("Is there an initial deposit (y/n)? ");
		char isInitial = sc.next().charAt(0);
		
		Customer customer;
		
		if (isInitial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			customer = new Customer(accountNumber, accountName, initialDeposit);
		}
		
		else {
			customer = new Customer(accountNumber, accountName);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(customer);
		
		System.out.print("\nEnter a deposit value: ");
		double money = sc.nextDouble();
		
		customer.deposit(money);
		System.out.println("Updated account data:");
		System.out.println(customer);
		
		sc.nextLine();
		
		System.out.print("\nEnter a withdraw value: ");
		double moneOut = sc.nextDouble();
		
		customer.withdraw(moneOut);
		System.out.println("Updated account data:");
		System.out.println(customer);
		
		sc.close();
	}

}
