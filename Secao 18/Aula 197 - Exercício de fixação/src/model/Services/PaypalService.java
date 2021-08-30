package model.Services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) { //2%
		return amount + (amount * 0.2);
	}

	@Override
	public Double interest(Double amount, Integer months) { //1%
		return amount + (amount * (0.1 * months));
	}

	
}
