package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DepositException;
import model.exceptions.WithdrawException;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch (InputMismatchException e) {
			System.err.println("Tipo de entrada inválida!");
		}
		catch (WithdrawException e) {
			System.err.println("Falha ao realizar saque! " + e.getMessage());
		}
		catch (DepositException e) {
			System.err.println("Falha ao realizar o depósito! " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.err.println("Erro inesperado!");
		}
		finally {
			sc.close();
		}
		
	}

}
