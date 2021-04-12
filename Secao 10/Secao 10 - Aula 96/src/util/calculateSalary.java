package util;

public class calculateSalary {

	public static double calculate(double salary, double percentage) {
		return salary * ((percentage/100) + 1);
	}
}
