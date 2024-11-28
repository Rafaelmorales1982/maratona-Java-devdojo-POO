package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time1 {
	
	private String nome;
	private int anoFundado;
	
	public Time1(String nome, int anoFundado) {
		this.nome = nome;
		this.anoFundado = anoFundado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void setAnoFundado(int anoFundado) {
		this.anoFundado = anoFundado;
	}
	
	public int getAnoFundado() {
		return this.anoFundado;
	}
}
