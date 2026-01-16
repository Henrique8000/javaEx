package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			System.out.println("Entre com os dados do contrato:");
			
			System.out.print("Numero: ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Data (dd/MM/yyyy): ");
			String date = sc.nextLine();
			
			System.out.print("Valor do contrato: ");
			double totalValue = sc.nextDouble();
			
			Contract contract = new Contract(number, LocalDate.parse(date, fmt1), totalValue);
			
			System.out.print("Entre com o numero de parcelas: ");
			int numInstallment = sc.nextInt();
			
			ContractService service = new ContractService();
			
		}
		catch (Exception e) {
			System.out.println("Erro Inesperado! " + e.getMessage());
		}
		finally {
			System.out.println("Finalizando o programa...");
		}
		
		
	}

}
