package devdojo.enumeracao.test;

import devdojo.enumeracao.Cliente;
import devdojo.enumeracao.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Rafael", TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Elaine", TipoCliente.PESSOA_JURIDICA);
		
		System.out.println("Cliente .: "+cliente1);
		System.out.println("Cliente .: "+cliente2);

	}

}
