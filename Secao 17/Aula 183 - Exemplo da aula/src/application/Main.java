 package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//É passado entre parenteses o caminho na qual o documento está localizado. 
		File file = new File("C:\\Users\\icand\\Documents\\Eclipse\\javaCourse\\Secao 17\\Aula 183 - Exemplo da aula\\in.txt");
		
		Scanner sc = null;
		try {
			//Passo, como uma nova intancia recebendo o arquivo. 
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) 	//hasNextLine ve se há mais uma linha no arquivo para ser lido
				System.out.println(sc.nextLine()); //ler de fato a linha 		
			//a lógica desse while é enquanto tiver mais uma próxima linha, imprima na tela. 
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if(sc != null)		//faz o teste para saber se o objeto está instanciado
				sc.close();
		}
	}

}
