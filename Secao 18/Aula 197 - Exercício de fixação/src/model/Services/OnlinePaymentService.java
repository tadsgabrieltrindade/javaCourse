package model.Services;

public interface OnlinePaymentService {
	
	public Double paymentFee(Double amount); //taxa de pagamento
	
	public Double interest(Double amount, Integer months); //juros mensal 
}
