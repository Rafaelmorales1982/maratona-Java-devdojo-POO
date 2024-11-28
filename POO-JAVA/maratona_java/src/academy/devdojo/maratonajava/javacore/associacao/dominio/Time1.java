package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time1 {
	
	private String nome;
	private int anoFundado;
	//associação muitos jogadores
	private Jogador1[] jogadores;
	
	
	//construtor padrão
	public Time1(String nome, int anoFundado) {
		this.nome = nome;	
		this.anoFundado = anoFundado;
		
		
		
	}
	
	//construtor com sobrecarga
	public Time1(String nome, int anoFundado, Jogador1[] jogadores) {
		this.nome = nome;	
		this.anoFundado = anoFundado;
		this.jogadores = jogadores;
		
		
	}
	
	public void imprime() {
		System.out.println("Nome Time .: "+this.nome+ " Foi fundado em .:"+this.anoFundado);
		if(jogadores == null) {
			return;
		}
		else {
			for (Jogador1 jogador1 : jogadores) {
				System.out.println("Jogador .:" +jogador1.getNome()+" Idade .:"+jogador1.getIdade());
			}
			
		}
	}
	
	public void setJogadores(Jogador1[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public Jogador1[] getJogadores() {
		return this.jogadores;
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
