package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//referência - https://www.alura.com.br/artigos/como-separar-palavras-de-string-em-java?gclid=Cj0KCQjw7pKFBhDUARIsAFUoMDbG-z4XY2Sf62Z6d-nq5jYucpFhY46eelvsJQgw5Ac3E5vLVsHctvkaAu7VEALw_wcB
		//método split()
		String text = "Hello World Just Do!";
		String[] text2 = text.split(" "); //posso usar o método split para separar com ";", "espaço"...		
		print(text2);

		//utilizei a expressão "\s" que significa espaço em branco a seguir:
		String text3 = "Olá; Bem; Vindo";
		String [] text4 = text3.split(";\\s");	//separa através do ; E elimina o espaço
		print(text4);
		String [] text5 = text3.split(";|;\\s"); //separa através do ; OU através do ; e eliminando o espaço
		print(text5);
		
		//outro exemplo:
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite palavras para colocar em um array (separar com espaço para cada índice): ");
		String [] array = sc.nextLine().split(" ");
		System.out.print("Qual elemento do array quer retornar? ");
		int pos = sc.nextInt();
		System.out.println(array[pos]);
		sc.close();
	}
	
	public static void print(String [] s) {
		for(String i: s)
			System.out.print(i); //ou println
		System.out.println();
	}
}
