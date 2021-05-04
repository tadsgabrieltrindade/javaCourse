package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthday = sc.nextLine();
		Client c1 = new Client(name, email, birthday);
		
		System.out.println("\n-------Enter order data:");
		System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED or DELIVERED): ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		Order od = new Order(c1, status);
		
		
		for(int i=0; i<quantity; i++) {
			System.out.println("\n---Enter #" +(i+1)+ " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: U$");
			Double produtctPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer produtctQuantity = sc.nextInt();
			Product product = new Product(productName, produtctPrice);
			OrderItem orderItem = new OrderItem(product, produtctQuantity);
			od.addItem(orderItem);
		}
		
		System.out.println(od.toString());
		
		sc.close();
		
		

	}

}
