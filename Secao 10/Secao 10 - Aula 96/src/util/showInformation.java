package util;

import java.util.List;
import entities.Employee;

public class showInformation {

	public static void show(List<Employee> employeeList) {
		System.out.println("\nList of employees: ");
		for(int i=0; i<employeeList.size(); i++) {
			 System.out.println(employeeList.get(i).toString());
		}
	}
}
