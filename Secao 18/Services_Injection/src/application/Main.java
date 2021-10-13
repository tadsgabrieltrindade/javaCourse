package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import domain.entities.Contract;
import domain.services.ContractService;
import domain.services.PaypalService;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Contract contract = new Contract();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ContractService service = new ContractService(new PaypalService());
		
		System.out.println("Enter contract date ");
		System.out.print("Number: ");
		contract.setNumber(sc.nextInt());
		System.out.print("Date (dd/MM/yyyy): ");
		contract.setDate(sdf.parse(sc.next()));
		System.out.print("Contract value: ");
		contract.setTotalValue(sc.nextDouble());
		
		System.out.print("Enter number of installments: ");
		Integer numberInstallments = sc.nextInt();
		
		System.out.println("Installments:");
		
		service.processContract(contract, numberInstallments);
		
		sc.close();
	}
}
