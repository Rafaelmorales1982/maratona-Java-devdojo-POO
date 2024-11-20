package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

	//criando um método soma
	public void somaDoisNumeros() {
		System.out.println("A Soma dois números :"+(10 + 10));
	}
	
	//criando método subtrair
	public void subtrairDoisNumeros() {
		System.out.println("A Subtração de dois números: "+(22 - 2));
	}
	
	//criando método sem retorno multiplicação com parâmetros 
	public void multiplicacaoDoisNumeros(double num1, double num2 ) {
		System.out.println("Multiplicação "+num1+" X "+num2+ " = " +(num1 * num2));
		
	}
	
	//criando método com retorno divisão comparêmtro
	
	public double dividiDoisNumeros(double num1, double num2) {
		
		if (num1 == 0 || num2 == 0) {
			System.out.println( "Não exiiste divisão por zero");
			return 0;
		}else {
		return num1 / num2;
		}
	}
	
	
	public void alteraDoisNumeros(int num1, int num2) {
		
		num1 = 99;
		num2 = 33;
		System.out.println("Dentro alteraDoisNumeros");
		System.out.println("Num1 "+num1);
		System.out.println("num2 "+num2);
	}
	
	
}
