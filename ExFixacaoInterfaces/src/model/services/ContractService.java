package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
	
		for (int i=0; i<months; i++) {
			double amount = contract.getTotalValue() / months;
			LocalDate nextDueDate = contract.getDate().plusMonths(i+1);
			
			amount = onlinePaymentService.interest(amount, i+1);
			
			amount = onlinePaymentService.paymentFee(amount );
			
			contract.addInstallment(new Installment(nextDueDate, amount));
		}
		
	}
	
}
