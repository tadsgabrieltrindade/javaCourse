package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int employeeAmount = sc.nextInt();
		
		for(int i=0; i<employeeAmount; i++) {
			Employee e;
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char op = sc.next().charAt(0); //pega o caractere do índice desejado, no caso o primeiro.
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hours: U$");
			Double valuePerHour = sc.nextDouble();
			
			if(op == 'n') {
				 e = new Employee(name, hours, valuePerHour);
			}else {
				System.out.print("Additional charge: U$");
				Double additional = sc.nextDouble();
				 e = new OutSourcedEmployee(name, hours, valuePerHour, additional);
			}
			
			employees.add(e);
			System.out.println("\n");
		}
		sc.close();
		showDataEmployee(employees);
	}
	
	public static void showDataEmployee(List<Employee> list) {
		System.out.println("\nPAYMENTS: ");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName() + " - U$" + String.format("%.2f", list.get(i).payment()) + "\n");
		}
	}

}
