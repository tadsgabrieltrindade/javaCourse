package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			account.setNumber(sc.nextInt());
			sc.nextLine();
			
			System.out.print("Holder: ");
			account.setHolder(sc.nextLine());
			
			System.out.print("Initial balance: ");
			account.deposit(sc.nextDouble());
			
			System.out.print("Withdraw limit: ");
			account.setWithdrawLimit(sc.nextDouble());
			
			System.out.print("\nEnter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.print("Successful! New balance: " + String.format("%.2f", account.getBalance()));

			
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e);
			
		}catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e);	
		}
		sc.close();
	}

}
