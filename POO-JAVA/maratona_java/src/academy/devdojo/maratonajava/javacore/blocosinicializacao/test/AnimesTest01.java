package academy.devdojo.maratonajava.javacore.blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.dominio.Animes;

public class AnimesTest01 {

	public static void main(String[] args) {
		
		Animes animes = new Animes("Sword Online");
		
//		System.out.println("\n "+animes.getEpisodios());
	
		for (int episodio :animes.getEpisodios()) {
			System.out.print(episodio+ " ");
		}
		System.out.println("\n "+animes.getNome());
		

	}

}