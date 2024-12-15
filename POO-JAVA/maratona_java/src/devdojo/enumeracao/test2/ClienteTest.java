package devdojo.enumeracao.test2;

import devdojo.enumeracao2.Cliente;
import devdojo.enumeracao2.Produto;
import devdojo.enumeracao2.TipoCliente;
import devdojo.enumeracao2.TipoPagamento;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Rafael", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO );
		Cliente cliente2 = new Cliente("Elaine", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO );
		
		Produto  produtoValor = new Produto(200);
		double valor =produtoValor.getValorProduto();
		System.out.println("Cliente .: "+cliente1);
		System.out.println("Cliente .: "+cliente2);
		
		
		
		System.out.println(" Valor do produto .: "+valor+" Valor de desconto no CRÉDITO .: "+TipoPagamento.CREDITO.calcularDesconto(valor));
		System.out.println(" Valor do produto .: "+valor+" Valor de desconto no DÉBITO .: "+TipoPagamento.DEBITO.calcularDesconto(valor));

	}

}
