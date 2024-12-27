package devdojo.polimorfismo.repositorio.servico;

import devdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
	@Override
	public void salvar() {
		System.out.println("Salvando em um Banco de Dados");
		
	}
	

}
