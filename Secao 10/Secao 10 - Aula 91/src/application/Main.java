package application;

import java.util.Scanner;

import entities.Bedroom;

public class Main {

	public static void main(String[] args) {
		Bedroom[] bedrooms = new Bedroom[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<amount; i++) {
			System.out.println("\nRent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine(); 
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Bedroom: ");
			int bedroomChosed = sc.nextInt();
			sc.nextLine();
			bedrooms[bedroomChosed] = new Bedroom(name, email);
		}
		sc.close();		
		
		System.out.println("\nBusy bedrooms: ");
		for(int i=0; i<bedrooms.length; i++) {
			if(bedrooms[i] != null) {
				System.out.println(i + "º: " + bedrooms[i]);
			}
		}
	}

}
