package devdojo.polimorfismo.repositorio.servico.teste;

import java.util.LinkedList;
import java.util.List;

import devdojo.polimorfismo.repositorio.Repositorio;
import devdojo.polimorfismo.repositorio.servico.RepositorioArquivo;
import devdojo.polimorfismo.repositorio.servico.RepositorioBancoDeDados;
import devdojo.polimorfismo.repositorio.servico.RepositorioMemoria;

public class RepositorioTeste {

	public static void main(String[] args) {
		
		Repositorio repositorio = new RepositorioBancoDeDados();
		repositorio.salvar();
		
		List<String> list = new LinkedList<>();
		list.add("Goku");
		list.add("Vegeta");
		list.add("Kuririn");
		
		System.out.println(list);
		
		Repositorio repositorio2 = new RepositorioMemoria();
		repositorio2.salvar();
		
		List<String> list2 = new LinkedList<>();
		list2.add("Goku2");
		list2.add("Vegeta2");
		list2.add("Kuririn2");
		System.out.println(list2);
		
		Repositorio repositorio3 = new RepositorioArquivo();
		repositorio3.salvar();
		
		List<String> list3 = new LinkedList<>();
		list3.add("Goku3");
		list3.add("Vegeta3");
		list3.add("Kuririn3");
		System.out.println(list3);

	}

}
