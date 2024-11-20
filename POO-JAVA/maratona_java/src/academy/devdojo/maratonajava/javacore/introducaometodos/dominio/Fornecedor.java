package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Fornecedor {

	public String nome;
	public String cnpj[];
	public String endereco;
	public double valorPedido[];
	
	public void imprime() {
		System.out.println("Nome fornecedor "+this.nome);
		mostrarCnpj();
		System.out.println("Endereço fornecedor "+this.endereco);
		System.out.println("Média que foi gasto no fornecedor: "+calcMediaValorPedido());
	}
	
	public double calcMediaValorPedido() {
		double media = 0;
		for (double valores : valorPedido) {
			media += valores / valorPedido.length;
		}
		return media;
		
	}
	
	public void mostrarCnpj() {
		for(String mostraCnpj : cnpj) {
			System.out.println("CNPJ da empresa "+mostraCnpj);
		}
	}
	
}
