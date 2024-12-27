package devdojo.polimorfismo.test;
import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Produto;
import devdojo.polimorfismo.Tomate;
import devdojo.polimorfismo.servico.CalculadoraImposto;
public class ProdutoTest03 {

	public static void main(String[] args) {
	Produto produto1 = new Computador("Ryzen 9",3000);
	Tomate tomate =new Tomate("Tomate Americano", 20);

	tomate.setDataValidade("25/12/2024");
	CalculadoraImposto.calcularImposto(produto1);
	CalculadoraImposto.calcularImposto(tomate);
	
	}

}
