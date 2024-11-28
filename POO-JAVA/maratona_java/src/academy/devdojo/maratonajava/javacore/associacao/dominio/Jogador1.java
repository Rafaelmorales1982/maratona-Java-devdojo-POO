package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Jogador1 {
	private String nome;
	private int idade;
	private Time1 time;

	
	
	public void imprime(){
		System.out.println("Jogador .: "+this.nome);
		System.out.println("Idade .: "+this.idade);
		System.out.println("Time .: "+time.getNome());
		System.out.println("Foi fundado como uma equipe de futebol no dia 1 de setembro de .: "+time.getAnoFundado());
	}
	
	//Construtor jogador1
	public Jogador1(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setTime(Time1 time) {
		this.time = time;
	}
	
	//pegando da class Time.java
	public Time1 getTime() {
		return this.time;
	}
}
