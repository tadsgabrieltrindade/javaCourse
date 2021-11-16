package application;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;
import entities.Produto;

public class Main {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();

		pessoa1.setNome("Irina");
		pessoa1.idade = 19;
		
		pessoa2.setNome("Gabriel");
		pessoa2.idade = 19;
		
		pessoa3.setNome("Igor");
		pessoa3.idade = 19;
		
		String nome;
		
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);  		//0
		pessoas.add(pessoa2);		//1
		pessoas.add(pessoa3);		//2
		
		for(int i = 0; i<=pessoas.size(); i++ ) {
			System.out.println(pessoas.get(i));
		}
		
		
		/*
		 * for(TIPO_DA_VARIAVEL nome_variavel : LISTA){
		 * 
		 * 
		 * 	}
		 * */
		
		
		for(Pessoa i : pessoas ) {
			System.out.println(i.getNome());
		}
		

	}
}
