package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador1;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time1;

public class JogadorTesteTime {

	public static void main(String[] args) {
		Jogador1 jogador1 = new Jogador1("Rafael Morales",42);
		Time1 time1 = new Time1("Corinthians", 1910);
		
		jogador1.setTime(time1);
		jogador1.imprime();
		

	}

}
