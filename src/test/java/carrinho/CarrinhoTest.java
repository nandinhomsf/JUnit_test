package carrinho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes")
public class CarrinhoTest {

	private Carrinho carrinho;
	private Produto produto1;
	private Produto produto2;
	
	@BeforeEach
	public void setUp() {
		carrinho = new Carrinho();
		produto1 = new Produto("Produto 1", 10.0);
		produto2 = new Produto("Produto 2", 20.0);
	}
	
	@Test
	@DisplayName("Teste de do carrinho valor total")
	public void testGetValorTotal() {
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		assertEquals(30.0, carrinho.getValorTotal(), 0.0);
	}
	
	@Test
	@DisplayName("Teste de adicionar produto ao carrinho")
	public void testAddItem() {
		carrinho.addItem(produto1);
		assertEquals(1, carrinho.getQtdeItems());
	}
	
	@Test
	@DisplayName("Teste de remover produto ao carrinho")
	public void testRemoveItem() throws ProdutoNaoEncontradoException {
		carrinho.addItem(produto1);
		carrinho.removeItem(produto1);
		assertEquals(0, carrinho.getQtdeItems());
	}
	
	@Test
	@DisplayName("Teste de remover produto que não existe no carrinho")
	public void testRemoveItemInexistente() {
		assertThrows(ProdutoNaoEncontradoException.class, () -> carrinho.removeItem(produto1));
	}
	
	@Test
	@DisplayName("Teste de obter quantidade de produtos no carrinho")
	public void testGetQtdeItems() {
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		assertEquals(2, carrinho.getQtdeItems());
	}
	
	@Test
	@DisplayName("Teste de esvaziar o carrinho")
	public void testEsvazia() {
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		carrinho.esvazia();
		assertEquals(0, carrinho.getQtdeItems());
	}

	@Test
	@DisplayName("Teste de comparação de produtos com outros produtos, com base no nome")
	public void testEquals() {
		Produto produto1Outro = new Produto("Produto 1", 15.0);
		Produto produto2Outro = new Produto("Produto 2", 25.0);
		Produto produto3 = new Produto("Produto 3", 30.0);
		Produto produto4 = null;
		assertEquals(produto1, produto1Outro);
		assertEquals(produto2, produto2Outro);
		assertNotEquals(produto1, produto2);
		assertNotEquals(produto1, produto3);
		assertNotEquals(produto2, produto1);
		assertNotEquals(produto2, produto3);
		assertNotEquals(produto2, produto4);
		assertNotEquals(produto2, carrinho);
	}
	
}
