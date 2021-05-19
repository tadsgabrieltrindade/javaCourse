package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//refer�ncia - https://www.alura.com.br/artigos/como-separar-palavras-de-string-em-java?gclid=Cj0KCQjw7pKFBhDUARIsAFUoMDbG-z4XY2Sf62Z6d-nq5jYucpFhY46eelvsJQgw5Ac3E5vLVsHctvkaAu7VEALw_wcB
		//m�todo split()
		String text = "Hello World Just Do!";
		String[] text2 = text.split(" "); //posso usar o m�todo split para separar com ";", "espa�o"...		
		print(text2);

		//utilizei a express�o "\s" que significa espa�o em branco a seguir:
		String text3 = "Ol�; Bem; Vindo";
		String [] text4 = text3.split(";\\s");	//separa atrav�s do ; E elimina o espa�o
		print(text4);
		String [] text5 = text3.split(";|;\\s"); //separa atrav�s do ; OU atrav�s do ; e eliminando o espa�o
		print(text5);
		
		//outro exemplo:
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite palavras para colocar em um array (separar com espa�o para cada �ndice): ");
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
