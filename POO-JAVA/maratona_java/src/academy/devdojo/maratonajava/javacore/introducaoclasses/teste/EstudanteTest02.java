package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
	
		estudante1.nome = "Rafael";
		estudante1.idade = 42;
		estudante1.sexo = 'M';
	  
		estudante2.nome = "Elaine";
		estudante2.idade = 39;
		estudante2.sexo = 'F';
	
		System.out.println("Estudante 1");
		System.out.println(estudante1.nome);
		System.out.println(estudante1.idade);
		System.out.println(estudante1.sexo);
		
		System.out.println("Estudante 2");
		System.out.println(estudante2.nome);
		System.out.println(estudante2.idade);
		System.out.println(estudante2.sexo);
	}

}
