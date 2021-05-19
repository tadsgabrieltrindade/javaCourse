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
		System.out.print("Digite nomes separados por espa�o: ");
		//Pega os nomes e colocar em cada �ndice do vetor. Cada �ndice � represetado pelo espa�o
		String[] nome = sc.nextLine().split(" ");
		System.out.print("Digite uma posi��o para retorno: ");
		int pos = sc.nextInt();
		System.out.println("O elemento do �ndice " + pos + " no array � " + nome[pos]);
		sc.close();
		
		//obs:pode dar uma excec�o quando digitar um �ndice que n�o existe no vetor ou;
		//quando o usu�rio digita uma letra no lugar do n�mero do �ndice.
	}
	
	public static void comExcecao() {
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		try {
			System.out.print("Digite nomes separados por espa�o: ");
			String[] nome = sc.nextLine().split(" ");
			System.out.print("Digite uma posi��o para retorno: ");
			pos = sc.nextInt();
			System.out.println("O elemento do �ndice " + pos + " no array � " + nome[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("O vetor n�o possui o �ndice " + pos +"!");
		}
		catch(InputMismatchException e) {
			System.out.println("A entrada de um �ndice deve ser um n�mero e n�o uma(s) letra(s)!");
		}
		
		System.out.println("\t\t>>>Fim do programa!<<<");
		
		sc.close();
	}

}
