package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		List<Product> list = new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int amount = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<list.size(); i++) {
			System.out.println("\n---PRODUCT #" + (i+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = sc.next().charAt(0);
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("\nPrice: $");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			if(op == 'c')
				list.add(new Product(name, price));
			
			if(op == 'i') {
				System.out.print("Customs fee: $");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			if(op == 'u') {
				System.out.print("\nManufacture date (DD/MM/A/YYYY): ");
				String date = sc.nextLine();
				list.add(new UsedProduct(name, price, date));
			}
		}
		sc.close();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).priceTag());
		}
	}

}
