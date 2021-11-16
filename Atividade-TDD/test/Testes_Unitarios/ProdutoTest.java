package Testes_Unitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Produto;

public class ProdutoTest {
	private Produto produto;
	
	@Before
	public void executarAntesDeCadaMetodo() {
		this.produto = new Produto();
	}

	@Test(expected = RuntimeException.class)
	public void naoDeveAceitarProdutosComEstoqueMaximoMaioQueCem() {
		
		assertEquals(-1, produto.definirEstoqueMaximo(105));
		if(produto.definirEstoqueMaximo(105) == -1) {
			throw new RuntimeException("Valor inserido é maior do que o permitido.");
		}
	}
	
	
	@Test(expected = RuntimeException.class)
	public void naoDeveAceitarProdutosComEstoqueMinimoMenorCinco() {
		if(produto.definirEstoqueMaximo(105) == -1) {
			throw new RuntimeException("Valor inserido é menor do que o permitido.");
		}
	}
}