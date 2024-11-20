package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.nome = "Rafael";
		func.idade = 42;
		func.salarios = new double[] {1200, 1300, 1100};
		
		
		func.imprime();
	}

}
