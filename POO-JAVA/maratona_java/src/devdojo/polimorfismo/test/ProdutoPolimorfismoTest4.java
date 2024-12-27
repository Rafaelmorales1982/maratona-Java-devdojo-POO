package devdojo.polimorfismo.test;
import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Produto;
import devdojo.polimorfismo.Tomate;

public class ProdutoPolimorfismoTest4 {

	public static void main(String[] args) {
	//utilizando polimorfismo
		
		System.out.println("---------Produto Computador--------------");
		Produto produto = new Computador("Ryzen 9", 7000);
	
		
		System.out.println("--------Produto Tomate------------------");
		Tomate tomate = new Tomate("Tomate de Diamante", 20);
		tomate.setDataValidade("26/12/2024");
	}

}
