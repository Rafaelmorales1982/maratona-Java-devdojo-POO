package devdojo.abstrata.test;


import devdojo.abstrata.Desenvolvedor;
import devdojo.abstrata.Gerente;

public class FuncionarioTeste {

	public static void main(String[] args) {

		//Funcionario funcionario1 = new Funcionario("Rafael", 5000); abstract não posso instaciar um objeto
		Gerente gerente1 = new Gerente("Elaine", 10000);
		Desenvolvedor desenvolvedor1 = new Desenvolvedor("Rafael", 5000);
		System.out.println(gerente1);
		System.out.println(desenvolvedor1);
		gerente1.imprime();
		desenvolvedor1.imprime();
	}

}
