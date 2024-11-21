package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time {

	private String nome;
	
	
	//construtor
	public Time(String nome) {
		this.nome = nome;
	}
	
	//set
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	//get
	public String getNome() {
		return this.nome;
	}
	
}
