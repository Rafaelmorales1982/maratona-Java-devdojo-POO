package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Fornecedor;

public class FornecedorTest01 {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.nome = "Auto Peças Avenida";
		fornecedor.cnpj = new String[] {"1111111111","2222222222"};
		fornecedor.endereco = "Rua Dante Pasqualeto"; 
		fornecedor.valorPedido = new double[] {3000, 4500};
		
		fornecedor.imprime();

	}

}
