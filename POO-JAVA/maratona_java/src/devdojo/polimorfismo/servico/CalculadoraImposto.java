package devdojo.polimorfismo.servico;

import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Produto;
import devdojo.polimorfismo.Tomate;

public class CalculadoraImposto {

//	public static void calcularImpostoComputador(Computador computador) {
//		System.out.println("Relatório de imposto do computador");
//		double imposto = computador.calcularImposto();
//		System.out.println("Computador nome.: "+computador.getNome());
//		System.out.println("Valor.: "+computador.getValor());
//		System.out.println("Imposto.: "+imposto);
//	}
//	
//	
//	public static void calcularImpostoTomate(Tomate tomate ) {
//		System.out.println("Relatório de imposto do Tomate");
//		double imposto = tomate.calcularImposto();
//		System.out.println("Tomate nome.: "+tomate.getNome());
//		System.out.println("Valor.: "+tomate.getValor());
//		System.out.println("Imposto.: "+imposto);
//		
//	}
	
	public static void calcularImposto(Produto produto) {
		System.out.println("------Relatório de Imposto----------\n");
		double imposto = produto.calcularImposto();
		System.out.println("Produto .: "+produto.getNome());
		System.out.println("Valor .: "+produto.getValor());
		System.out.println("Imposto a ser pago .:[.... "+imposto+" ....]\n");
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getNome()+" data validade.: "+tomate.getDataValidade());
		}
		
		
	}
}
