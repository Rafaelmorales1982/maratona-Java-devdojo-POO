package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();//criando objeto da classe Estudante
		 estudante.nome = "Luffy";
		 estudante.idade = 21;
		 estudante.sexo = 'M';
		 
		 System.out.println(estudante.nome);
		 System.out.println(estudante.idade);
		 System.out.println(estudante.sexo);
	}

}
