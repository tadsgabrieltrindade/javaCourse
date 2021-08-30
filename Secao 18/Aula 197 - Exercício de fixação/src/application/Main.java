package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Domain.Contract;
import model.Services.ContractService;
import model.Services.PaypalService;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		String dateString = sc.nextLine();
		date = sdf.parse(dateString);
		System.out.print("Contract Value: U$");
		Double value = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		PaypalService ppService = new PaypalService();
		ContractService contractService = new ContractService(ppService);
		contractService.processContract(contract, installments);
		
		sc.close();
	}

}