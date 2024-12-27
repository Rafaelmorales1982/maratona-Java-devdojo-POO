package devdojo.polimorfismo.test;

import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Televisao;
import devdojo.polimorfismo.Tomate;
import devdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoPolimorfismoTest {

	public static void main(String[] args) {
		Computador computador = new Computador("Ryzen 5 4600 16 Ram SSD 480 GTX 1660TI ", 4000);
		Tomate tomate = new Tomate("Tomate Agentino ", 10);
		Televisao tv = new Televisao("Samsung 60\" ", 3300);
		CalculadoraImposto.calcularImposto(computador);
		CalculadoraImposto.calcularImposto(tomate);
		CalculadoraImposto.calcularImposto(tv);
	}

}
