package domain.services;

import java.util.ArrayList;
import java.util.List;

import domain.entities.Contract;

public class PaypalService implements OnlinePaymentService {

	private Contract contract;
	private Double basicValuePerMonth;

	public PaypalService() {
	}

	@Override
	public Double paymentFree(Double amount) {
		return amount + (amount * 0.02);
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount + ((amount * 0.01) * months);
	}

}
