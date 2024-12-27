package devdojo.polimorfismo;

public class Tomate extends Produto {
	private String dataValidade;

	public static final double IMPOSTO = 0.10;
	public Tomate(String nome, double valor) {
		super(nome, valor);
		
	}
	@Override
	public double calcularImposto() {
		System.out.println("Imposto produto TOMATE ");
		return this.valor * IMPOSTO;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	

}
