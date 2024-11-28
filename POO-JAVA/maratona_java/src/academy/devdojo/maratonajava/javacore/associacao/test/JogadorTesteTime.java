package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador1;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time1;

public class JogadorTesteTime {

	public static void main(String[] args) {
		Jogador1 jogador1 = new Jogador1("Rafael Morales",42);
		Jogador1 jogador2 = new Jogador1("Morales",40);
		Time1 time1 = new Time1("Corinthians", 1910);
		Jogador1[] jogadores = {jogador1, jogador2};
	
	
		jogador1.setTime(time1);
		time1.setJogadores(jogadores);
		
		System.out.println(" Jogador");
		jogador1.imprime();
		
		
		
		System.out.println("Time e seus jogadores");
		time1.imprime();
		

	}

}
