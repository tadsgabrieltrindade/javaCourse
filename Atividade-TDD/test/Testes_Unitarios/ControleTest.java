package Testes_Unitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entities.Controle;
import entities.Estoque;
import entities.Produto;

public class ControleTest {
	private Produto produto;
	private Controle controle;
	private List<Produto> esperado;

	@Before
	public void executarAntesDeCadaMetodo() {
		this.produto = new Produto();
		this.controle = new Controle();
		produto.setNome("Maça");

		esperado = new ArrayList<Produto>();
	}

	@Test
	public void deveControlarProdutosComEstoqueInsuficiente() {
		controle.definiProdutoComEstoqueInsuficiente(produto);

		esperado.add(produto);

		assertEquals(esperado, controle.getProdutosComEstoqueInsulficiente());
	}

	@Test
	public void deveControlarProdutosComEstoqueExcedente() {
		produto.setEstoqueMaximo(70);
		produto.setQuantidade(75);
		controle.definiProdutosComEstoqueExcedente(produto);

		esperado.add(produto);
		assertEquals(esperado, controle.getProdutosComEstoqueExcedente());
	}

	@Test
	public void deveControlarProdutosComEstoqueZerado() {
		controle.definirProdutosComEstoqueZerado(produto);

		esperado.add(produto);
		assertEquals(esperado, controle.getProdutosComEstoqueZerado());
	}

	@Test
	public void deveControlarProdutosComEstoqueAdequado() {
		controle.definirProdutosComEstoqueAdequado(produto);

		esperado.add(produto);
		assertEquals(esperado, controle.getProdutosComEstoqueAdequado());
	}

	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutos() {
		Estoque estoque = new CriadorEstoque().nomeLoja("KRE Market").criar();

		List<Produto> esperado = new ArrayList<Produto>();

		assertEquals(esperado, controle.verificarSeHaProdutosNoEstoque(estoque));
	}

	@Test
	public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado() {
		Estoque estoque = new CriadorEstoque().nomeLoja("KRE Market").criar();
		produto.setQuantidade(25);
		estoque.getProdutos().add(produto);

		assertEquals(esperado, controle.verificarSeProdutosZerados(estoque));
	}

	@Test(expected = RuntimeException.class)
	public void naoDeveControlarEstoqueSemNenhumProduto() {
		Estoque estoque = new CriadorEstoque().nomeLoja("KRE Market").criar();
		if (estoque.getProdutos().size() == 0)
			throw new RuntimeException("O estoque não tem produtos cadastrados.");
	}
}
