package devdojo.polimorfismo.repositorio.servico;

import devdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo");
		
	}
	

}
