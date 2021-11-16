package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private String loja;
	private List<Produto> produtos;
	
	public Estoque() {
		this.produtos = new ArrayList<>();
	}

	public Estoque(String loja) {
		this.loja = loja;
		this.produtos = new ArrayList<>();
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public List<Produto> getProdutos() {
			return produtos;
	}

	public boolean armazenamento(Produto produto) {
		for(Produto p : produtos) {
			if(p.getNome() == produto.getNome())
				return false;
		}
		produtos.add(produto);
		return true;
	}
	
}
