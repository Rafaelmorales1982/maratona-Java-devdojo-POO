package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Escola {
	private String nome;
	private Professor[] professores;
	
	//construtor
	public Escola(String nome) {
		this.nome = nome;
	}
	
	//Construtor com sobrecarga
	public Escola(String nome, Professor[] professores) {
		this.nome = nome;
		this.professores = professores;
	}
	
	
	
	
	public void imprime() {
		System.out.println("Nome Escola.: "+this.nome);
		if(professores == null) {
			return;
		}
		for (Professor professor : professores) {
			System.out.println("Professores.: "+professor.getNome());
			
		}
		
	}
	
	



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Professor[] getProfessores() {
		return professores;
	}



	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	
	
}
