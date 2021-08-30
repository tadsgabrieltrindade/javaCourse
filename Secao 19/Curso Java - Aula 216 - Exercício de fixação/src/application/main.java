package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> list = new HashMap<String, Integer>();
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer amount = Integer.parseInt(fields[1]);
				
				if(list.containsKey(name)) 
					list.put(name, amount+list.get(name));
				else 
					list.put(name, amount);
				line = br.readLine();
			}
			
			for(String k : list.keySet())
				System.out.println(k + ": " + list.get(k));
		} catch (Exception e) {
			e.getMessage();
		}finally {
			sc.close();
			System.out.println("Finish");
		}
		
	}
}
