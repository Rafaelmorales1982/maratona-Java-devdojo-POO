package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
 public static void main(String[] args) {
	 Pessoa pessoa = new Pessoa();//inicializando objeto
	 pessoa.setNome("Rafael");//iniciar os atributos
	 pessoa.setIdade(42);
	 pessoa.imprime();
	 
	 System.out.println("Nome: "+pessoa.getNome());
	 System.out.println("Idade: "+pessoa.getidade());
	 
 }
	
}
