package devdojo.modificadorfinal;

public class Carro {
	private String nome;
	public static final double VELOCIDADE_LIMITE = 250;//considerada constante não pode trocar valor
	public final Comprador COMPRADOR = new Comprador();
	
	
	
	public void imprime() {
		System.out.println("Nome carro .: "+this.nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
	
}
