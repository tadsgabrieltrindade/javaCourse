package domain.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import domain.entities.Contract;
import domain.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	/*Inversão de controle - Injeção de dependência*/
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicValuePerMonth = (double) contract.getTotalValue() / months;

		List<Double> valuePerInstallment = new ArrayList<Double>();
		Installment installment = new Installment();
		
		for(int i=1; i<=months; i++) {
			valuePerInstallment.add(paymentService.interest(basicValuePerMonth, months)); 	
		}
		
		for(int i=1; i<=months; i++) {
			valuePerInstallment.add((i-1), paymentService.paymentFree(valuePerInstallment.get(i-1)));
		}
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());
		
		for(int i=1; i<=months; i++) {
			calendar.add(Calendar.DAY_OF_MONTH, 30);
			installment.setAmount(valuePerInstallment.get(i));
			installment.setDueDate(calendar.getTime());
			
			System.out.println(installment);
			
			
		}
		
		
		
	}
	
}
