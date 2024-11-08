package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		
		professor1.nome = "Gabriel";
		professor1.idade = 14;
		professor1.sexo = 'M';
		
		
		System.out.println("Dados Professor 1");
		System.out.println(professor1.nome);
		System.out.println(professor1.idade);
		System.out.println(professor1.sexo);
		
		System.out.println("Imprimindo dados em uma única linha");
		System.out.println("Professor: "+professor1.nome+" sua idade: "
		+professor1.idade+ " sexo: "+professor1.sexo);
		
	}

}
