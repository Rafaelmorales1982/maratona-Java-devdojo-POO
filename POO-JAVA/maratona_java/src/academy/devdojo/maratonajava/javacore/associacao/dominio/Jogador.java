package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Jogador {
	private String nome;
	//associação 1 para 1 um jogador pode estar apenas um time
	private Time time;
	
	
	
	public void imprime() {
		System.out.println("Nome jogador.:"+this.nome);
		if( time != null) {
			System.out.println("Seu time.: "+time.getNome());
		}else {
			System.out.println("Opção Iválida...");
		}
	}
	
	//-----construtor Jogador---------
	public Jogador(String nome) {
		this.nome = nome;
		
	}
	//--------Geters e Seters Jogador-------------
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	
	
	//--------Geters e Seters Time-------------
	public void setTime(Time time) {
		this.time = time;
		
	}
	
	public Time getTime() {
		return this.time;
	}
}
