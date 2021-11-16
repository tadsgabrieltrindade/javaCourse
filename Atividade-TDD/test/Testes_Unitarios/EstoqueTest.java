package Testes_Unitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import entities.Estoque;
import entities.Produto;

public class EstoqueTest {

	@Test
	public void naoDeveAceitarProdutosComMesmoNome() {
		Produto produto1 = new Produto();
		produto1.setNome("Laranja");
		Produto produto2 = new Produto();
		produto2.setNome("Laranja");
		Estoque estoque = new Estoque();
		estoque.armazenamento(produto1);
		
		assertEquals(false, estoque.armazenamento(produto2));
	}
}
