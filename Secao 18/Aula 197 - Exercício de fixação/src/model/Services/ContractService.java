package model.Services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.Domain.Contract;

public class ContractService {
	
	private OnlinePaymentService methodPayment; 
	public ContractService(OnlinePaymentService typeMethod ) {
		methodPayment = typeMethod;
	}
	
	public void processContract(Contract contract, Integer months) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getData());
		Double baseValue = contract.getTotalValue() / months;
		for(int i = 1; i<=months; i++) {
			Double newValue = methodPayment.interest(baseValue, months);
			newValue =  methodPayment.paymentFee(newValue);
			calendar.add(Calendar.DAY_OF_MONTH, 30);
			System.out.println(sdf.format(calendar.getTime()) + " - U$" + newValue);
		}
		
	}
}
