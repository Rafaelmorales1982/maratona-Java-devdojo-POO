package academy.devdojo.maratonajava.javacore.sobrecargametodo.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodo.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {
		Anime anime = new Anime();
//		anime.setNome("Akudama Drive");
//		anime.setTipo("TV");
//		anime.setEpisodios(12);

		anime.init("Akudama Drive", "TV", 12, "Ação");
//		anime.setGenero("Ação");
		
		anime.imprime();
	}

}
