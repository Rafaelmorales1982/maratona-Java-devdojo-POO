package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
	
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();

		estudante01.nome = "Midorya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Kenjy";
		estudante02.idade = 38;
		estudante02.sexo = 'M';
		
		System.out.println("Estudante 01");
         impressora.imprime(estudante01);
         
         System.out.println("Estudante 02");
         impressora.imprime(estudante02);
		
		
		
		
	}

}
