package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro carro1 = new Carro("BMW", 280 );
		Carro carro2 = new Carro("Mercedes",270);
		Carro carro3 = new Carro("Audi", 290);
		
		Carro.setVelocidadeLimite(190);
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
		

	}

}
