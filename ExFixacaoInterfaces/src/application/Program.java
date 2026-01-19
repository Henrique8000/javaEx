package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			System.out.println("Entre com os dados do contrato:");
			
			System.out.print("Numero: ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(), fmt1);
			
			System.out.print("Valor do contrato: ");
			double totalValue = sc.nextDouble();
			
			Contract contract = new Contract(number, date, totalValue);
			
			System.out.print("Entre com o numero de parcelas: ");
			int numInstallment = sc.nextInt();
			
			ContractService service = new ContractService(new PaypalService());
			
			service.processContract(contract, numInstallment);
			
			System.out.println("Parcelas:");
			
			for (Installment i : contract.getInstallments()) {
				System.out.println(i);
			}
			
		}
		catch (Exception e) {
			System.out.println("Erro Inesperado! ");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finalizando o programa...");
		}
		
		
	}

}
