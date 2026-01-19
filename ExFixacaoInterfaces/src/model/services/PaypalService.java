package model.services;

public class PaypalService implements OnlinePaymentService{
	
	@Override
	public Double paymentFee(Double amount) {
		return (0.02 + 1) * amount;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return  amount * (1 + 0.01 * months);
	}
}
