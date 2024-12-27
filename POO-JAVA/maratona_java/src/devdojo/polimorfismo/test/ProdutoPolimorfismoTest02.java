package devdojo.polimorfismo.test;
import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Produto;
import devdojo.polimorfismo.Tomate;

public class ProdutoPolimorfismoTest02 {

	public static void main(String[] args) {
	//utilizando polimorfismo
		
		System.out.println("---------Produto Computador--------------");
		Produto produto = new Computador("Ryzen 9", 7000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		
		System.out.println("--------Produto Tomate------------------");
		Produto produto2 = new Tomate("Tomate de Diamante", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
	}

}
