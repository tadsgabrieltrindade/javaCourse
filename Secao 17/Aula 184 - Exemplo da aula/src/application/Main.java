package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//implementação básica, para ter uma noção a respeito do processo manual
		String path = "C:\\Users\\icand\\Documents\\Eclipse\\javaCourse\\Secao 17\\Aula 184 - Exemplo da aula\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//o BufferedReader é uma abstração maior
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			//o readLine ler uma linha do arquivo e, caso não tiver uma linha, ele retorna null.
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); 
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {	
			try {//pode ocorrer algum problema aqui no momento de fechar. 		
				if(fr != null)
					fr.close();
				if(br != null)
					br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
