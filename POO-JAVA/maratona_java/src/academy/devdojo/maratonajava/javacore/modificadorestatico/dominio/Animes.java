package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Animes {
	private String nome;
	private static int[] episodios;
	static {
		System.out.println("Bloco de inicialização ");
		//bloco de inicialização não preciso duplicar o mesmo código nos construtores
		//colocando 100 episodios
		episodios = new int[100];
		for(int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}
	
	//método construtor nome
	public Animes(String nome) {
		this.nome = nome;
	}
	
	
	//método construtor episodios
	public Animes() {
	
		for(int episodio : episodios) {
			System.out.print(episodio + " ");
		}
		
	}


	public String getNome() {
		return nome;
	}


	public int[] getEpisodios() {
		return episodios;
	}
	
	
	
	
}
