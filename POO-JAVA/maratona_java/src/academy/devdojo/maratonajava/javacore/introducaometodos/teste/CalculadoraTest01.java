package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	public static void main(String[] args) {

		Calculadora soma1 = new Calculadora();
		Calculadora subtrair2 = new Calculadora();
		Calculadora multiplicar3 = new Calculadora();
		System.out.println("\n Soma");
		soma1.somaDoisNumeros();
		
		System.out.println("\n Subtração");
		subtrair2.subtrairDoisNumeros();
		
		System.out.println("\n Multiplicação");
		multiplicar3.multiplicacaoDoisNumeros(2.5, 2.5);//Argumentos
	}

}
