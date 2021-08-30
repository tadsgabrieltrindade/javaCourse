package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\Users\\icand\\Documents\\Eclipse\\javaCourse\\Secao 17\\Aula 184 - Exemplo da aula\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); 
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
