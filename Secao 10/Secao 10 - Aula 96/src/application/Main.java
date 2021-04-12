package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import util.calculateSalary;
import util.seachId;
import util.showInformation; 

public class Main {

	public static void main(String[] args) {
		 List<Employee> employeeList = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("How many employees will be registered? ");
		 int amountEmployee = sc.nextInt();
		 for(int i = 0; i<amountEmployee; i++) {
			 System.out.println("\nEmployee #" + (1+i));
			 System.out.print("Id: ");
			 int idEmployee = sc.nextInt(); sc.nextLine();
			 System.out.print("Name: ");
			 String nameEmployee = sc.nextLine();
			 System.out.print("Salary: ");
			 double salaryEmployee = sc.nextDouble();
			 employeeList.add(new Employee(idEmployee, nameEmployee, salaryEmployee ));
		 }
		 
		 System.out.print("\nEnter the employee id that will have salary increase: ");
		 int id = sc.nextInt();
		 int position = seachId.seach(employeeList, id);  //a função deve retornar a posição do id
		 
		 if(position != -1) {		//se retornar -1 significa que não existe
			 System.out.print("Enter the percentage: ");
			 double percentage = sc.nextDouble();
			 //vou dar um mudar o salario do funcionário com a posição indicada "position"
			 employeeList.get(position).setSalary(calculateSalary.calculate(employeeList.get(position).getSalary(), percentage));
		 }else {
			 System.out.println("This ID does not exist! ");
		 }
		 sc.close();
		 
		 showInformation.show(employeeList); 
	}
}
