package entities;

import java.util.ArrayList;
import java.util.List;

public class Controle {
	private List<Produto> produtosComEstoqueInsulficiente;
	private List<Produto> produtosComEstoqueExcedente;
	private List<Produto> produtosComEstoqueZerado;
	private List<Produto> produtosComEstoqueAdequado;

	
	public Controle() {
		this.produtosComEstoqueInsulficiente = new ArrayList<Produto>();
		this.produtosComEstoqueExcedente = new ArrayList<Produto>();
		this.produtosComEstoqueZerado = new ArrayList<Produto>();
		this.produtosComEstoqueAdequado = new ArrayList<Produto>();
	}

	public List<Produto> getProdutosComEstoqueInsulficiente() {
		return produtosComEstoqueInsulficiente;
	}

	public List<Produto> getProdutosComEstoqueExcedente() {
		return produtosComEstoqueExcedente;
	}

	public List<Produto> getProdutosComEstoqueZerado() {
		return produtosComEstoqueZerado;
	}

	public List<Produto> getProdutosComEstoqueAdequado() {
		return produtosComEstoqueAdequado;
	}
	
	public void controlaEstoques(Estoque estoque) {
		return;
	}

	public void definiProdutoComEstoqueInsuficiente(Produto produto) {
		this.produtosComEstoqueInsulficiente.add(produto);
	}

	public void definiProdutosComEstoqueExcedente(Produto produto) {
		this.produtosComEstoqueExcedente.add(produto);
		
	}

	public void definirProdutosComEstoqueZerado(Produto produto) {
		this.produtosComEstoqueZerado.add(produto);
		
	}

	public void definirProdutosComEstoqueAdequado(Produto produto) {
		this.produtosComEstoqueAdequado.add(produto);
		
	}
	
	public List<Produto> verificarSeHaProdutosNoEstoque(Estoque estoque){
		if(estoque.getProdutos().size() == 0)
			return estoque.getProdutos();
		return null;
	}
	
	public List<Produto> verificarSeProdutosZerados(Estoque estoque){
		int verificador = 0;
		for(Produto p : estoque.getProdutos()) {
			if(p.getQuantidade() == 0)
				verificador = 1;
				break;
		}
		
		if(verificador == 0) {
			List<Produto> listaVazia = new ArrayList<Produto>();
			return listaVazia;
		} 
		return estoque.getProdutos();
	}
}
