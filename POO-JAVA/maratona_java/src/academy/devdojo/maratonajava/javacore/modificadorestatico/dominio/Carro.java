package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;
	
	//Método construtor
	public Carro(String nome, double velocidadeMaxima) {
	
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		
	}
	
	
	//método imprimir na tela
	public void imprime() {
		System.out.println("---------------------");
		System.out.println("Nome.: "+this.nome);
		System.out.println("Velocidade máxima.: "+this.velocidadeMaxima);
		System.out.println("Velocidade Limite.: "+Carro.velocidadeLimite);
	}
	
	
	//método para acessar velocidadeLimite
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
		
	}
	
	public static double getVelovidadeLimite() {
		return Carro.velocidadeLimite;
	}
	



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}


	
	
	
	
	
}
