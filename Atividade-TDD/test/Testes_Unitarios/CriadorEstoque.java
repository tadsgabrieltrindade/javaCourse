package Testes_Unitarios;

import entities.Estoque;
import entities.Produto;

public class CriadorEstoque {
	private Estoque estoque;
	
	public CriadorEstoque nomeLoja(String nome) {
		this.estoque = new Estoque(nome);
		return this;
	}
	
	public CriadorEstoque inserirProduto(Produto produto) {
		this.estoque.armazenamento(produto);
		return this;
	}
	
	public Estoque criar() {
		return estoque;
	}
}
