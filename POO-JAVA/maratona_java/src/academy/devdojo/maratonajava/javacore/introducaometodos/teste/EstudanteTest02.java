package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		
		
		estudante01.nome = "Rafael";
		estudante01.idade = 42;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Enzo";
		estudante02.idade = 3;
		estudante02.sexo = 'M';
		
		estudante01.imprime();
		estudante02.imprime();
		
	}

}
