package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.print("How many students for course A?");
		int j = sc.nextInt();
		for(int i=0; i<j; i++) {
			System.out.print("Enter with de code for student #" + (i+1) + ":");
			int code = sc.nextInt();
			set.add(code);
		}
		
		System.out.print("\nHow many students for course B?");
		j = sc.nextInt();
		for(int i=0; i<j; i++) {
			System.out.print("Enter with de code for student #" + (i+1) + ":");
			int code = sc.nextInt();
			set.add(code);
		}
		
		System.out.print("\nHow many students for course C?" + ":");
		j = sc.nextInt();
		for(int i=0; i<j; i++) {
			System.out.print("Enter with de code for student #" + (i+1)+ ":");
			int code = sc.nextInt();
			set.add(code);
		}
		
		System.out.println("\nThe total of students are " + set.size());	
		
		sc.close();
	}
}
