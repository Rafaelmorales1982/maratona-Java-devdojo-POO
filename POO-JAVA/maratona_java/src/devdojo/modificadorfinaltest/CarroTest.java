package devdojo.modificadorfinaltest;

import devdojo.modificadorfinal.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setNome("JEEP");
		carro.imprime();
		//para acessar uma constante
		System.out.println("Velocidade Limite.: "+Carro.VELOCIDADE_LIMITE);
		
		carro.COMPRADOR.setNome("Rafael");
		System.out.println(carro.COMPRADOR);
	}

}
