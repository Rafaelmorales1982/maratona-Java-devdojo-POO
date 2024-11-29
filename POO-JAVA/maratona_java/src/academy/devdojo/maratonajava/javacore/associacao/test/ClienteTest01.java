package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Cidade;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Cliente;

public class ClienteTest01 {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Rafael", "Rua José Mantuani", 42 );
		Cidade cidade1 = new Cidade("Marilena", "PR");
		Cidade cidade2 = new Cidade("Nova Londrina", "PR");
		Cidade cidade3 = new Cidade("Itaúna do Sul", "PR");
		Cidade cidade4 = new Cidade("Diamante do Norte", "PR");
		Cidade[] cidades = {cidade1, cidade2, cidade3, cidade4};
		
		
		
		cliente1.setCidade(cidades);
		
         cliente1.imprime();
	}

}
