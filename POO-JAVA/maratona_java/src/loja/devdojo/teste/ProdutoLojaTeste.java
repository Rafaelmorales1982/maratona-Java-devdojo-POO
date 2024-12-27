package loja.devdojo.teste;

import loja.devdojo.Computador;
import loja.devdojo.Notebook;
import loja.devdojo.servico.CalculadoraImposto;

public class ProdutoLojaTeste {

	public static void main(String[] args) {
		Computador computador = new Computador("Ryzen 5 4600G 16 Gigas DDR4 SSD 512 gtx 1050TI", 2500);
		CalculadoraImposto.imprimeImposto(computador);
		
		Notebook notebook = new Notebook("Notebook Acer nitro 5 Ryzen 7", 6000);
		CalculadoraImposto.imprimeImposto(notebook);
		
	}

}
