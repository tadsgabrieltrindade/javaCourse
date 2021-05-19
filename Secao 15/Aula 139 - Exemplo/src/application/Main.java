package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//semExcecao();
		comExcecao();
		
		

	}
	public static void semExcecao() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite nomes separados por espaço: ");
		//Pega os nomes e colocar em cada índice do vetor. Cada índice é represetado pelo espaço
		String[] nome = sc.nextLine().split(" ");
		System.out.print("Digite uma posição para retorno: ");
		int pos = sc.nextInt();
		System.out.println("O elemento do índice " + pos + " no array é " + nome[pos]);
		sc.close();
		
		//obs:pode dar uma excecão quando digitar um índice que não existe no vetor ou;
		//quando o usuário digita uma letra no lugar do número do índice.
	}
	
	public static void comExcecao() {
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		try {
			System.out.print("Digite nomes separados por espaço: ");
			String[] nome = sc.nextLine().split(" ");
			System.out.print("Digite uma posição para retorno: ");
			pos = sc.nextInt();
			System.out.println("O elemento do índice " + pos + " no array é " + nome[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("O vetor não possui o índice " + pos +"!");
		}
		catch(InputMismatchException e) {
			System.out.println("A entrada de um índice deve ser um número e não uma(s) letra(s)!");
		}
		
		System.out.println("\t\t>>>Fim do programa!<<<");
		
		sc.close();
	}

}
