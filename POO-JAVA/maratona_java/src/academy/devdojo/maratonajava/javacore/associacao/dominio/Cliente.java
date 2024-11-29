package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Cliente {
	private String nome;
	private String endereco;
	private int idade;
	private Cidade[] cidade;
	
	public Cliente(String nome, String endereco, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		
	}
	
	public Cliente(String nome, String endereco, int idade, Cidade[] cidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cidade = cidade;
	}
	
	//imprimir na tela
	public void imprime() {
		System.out.println("Nome cliente .: "+this.nome);
		System.out.println("Idade cliente .: "+this.idade);
		System.out.println("Endereço cliente .: "+this.endereco);
		for (Cidade cidades : cidade) {
			System.out.println("Cidade .: "+cidades.getNomeCidade()+" UF .: "+cidades.getEstado());
			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cidade[] getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade[] cidade) {
		this.cidade = cidade;
	}
	
	
	

}
