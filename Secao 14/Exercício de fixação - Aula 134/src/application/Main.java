package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("\nTax payer #%d data:", (i+1));
			System.out.print("\nIndividual orcompany(i/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income:");
			Double anualIncome = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int employeeAmount = sc.nextInt();
				list.add(new Company(name, anualIncome, employeeAmount));
			}
		}
		sc.close();
		
		System.out.println("\n>>>TAXES PAID: ");
		Double totalTax = 0.0;
		for(TaxPayer txp : list) {
			System.out.println(txp.getName() + ": $ " + String.format("%.2f", txp.tax()));
			totalTax += txp.tax();
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));
	}

}
