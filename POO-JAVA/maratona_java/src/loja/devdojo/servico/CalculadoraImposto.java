package loja.devdojo.servico;

import loja.devdojo.Produto;

public class CalculadoraImposto {
	
	public static void  imprimeImposto( Produto produto) {
		System.out.println(" ---------Relatório de Imposto ------------------\n");
		double imposto = produto.calcularImposto();
		System.out.println("Produto .: "+produto.getNome());
		System.out.println("Valor .: "+produto.getValor());
		System.out.println("Imposto a ser pago .: [" + imposto+ "]");
		System.out.println("Valor total com imposto .: [" + (produto.getValor()+imposto)+ "]");
		
	}

}
