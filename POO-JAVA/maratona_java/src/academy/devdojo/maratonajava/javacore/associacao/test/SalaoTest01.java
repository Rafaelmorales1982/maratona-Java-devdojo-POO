package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.FuncionariosSalao;
import academy.devdojo.maratonajava.javacore.associacao.dominio.SalaoBeleza;

public class SalaoTest01 {

	public static void main(String[] args) {

	FuncionariosSalao funcionario1 = new FuncionariosSalao("Mileide");
	FuncionariosSalao funcionario2 = new FuncionariosSalao("Dayane");
	FuncionariosSalao[] funcionarios = {funcionario1, funcionario2};
	
	SalaoBeleza salao = new SalaoBeleza("Espaço Elaine Cabeleireira",funcionarios);
	salao.imprime();

	}

}
