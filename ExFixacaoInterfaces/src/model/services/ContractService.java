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
			LocalDate nextDueDate = contract.getDate().plusMonths(i+1);
			
			contract.addInstallment(new Installment());
		}
		
	}
	
}
