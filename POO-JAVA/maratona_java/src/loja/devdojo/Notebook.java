package loja.devdojo;

public class Notebook extends Produto {
	public static final double IMPOSTO = 0.10;
	
	public Notebook(String nome, double valor) {
		super(nome, valor);
		
	}

	@Override
	public double calcularImposto() {
		 System.out.println("Imposto produto NOTEBOOK....");
		return this.valor * IMPOSTO;
	}
	
	

}
