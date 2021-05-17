package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("\nShape #%d data: \n", (i+1));
			System.out.print("Rectangle or Circle (r/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();
			
			if(op == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(width, height, color));
			}else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(radius, color));
			}
		}
		sc.close();
		System.out.println("\n>>>SHAPE AREAS:");
		for(Shape sp: list) {
			System.out.println(String.format("%.2f", sp.area()));
		}
	}

}


