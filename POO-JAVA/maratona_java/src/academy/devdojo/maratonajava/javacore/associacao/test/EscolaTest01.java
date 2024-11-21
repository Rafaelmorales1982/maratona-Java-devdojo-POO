package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {

	public static void main(String[] args) {
		//muitos professores para uma escola
		Professor professor1 = new Professor("Rafael");
		Professor professor2 = new Professor("Elaine");
		Professor[] professores = {professor1, professor2};
		
		Escola escola = new Escola("Vale do Tigre", professores);
		
		escola.imprime();
		
	}

}
