package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;
//sobre aclopamento
public class Pessoa {
	
	private String nome;
	private int idade;
	
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}
	
	
	//criando método geters e seters usar quando os atributos private
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Idade inválida");
			return;
		}
		this.idade = idade;
	}
	
	//utilizar método get para pegar um atributo
	
	public String getNome() {
		return this.nome;
	}
	
	public int getidade() {
		return this.idade;
	}
}