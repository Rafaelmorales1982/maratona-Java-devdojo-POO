package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carros;

public class CarrosTest01 {

	public static void main(String[] args) {
		
		Carros carro1 = new Carros();
		Carros carro2 = new Carros();
		
		carro1.nome = "Jeep Renegate";
		carro1.modelo = "SUV ";
		carro1.ano = 2019;
		
		carro2.nome = "S10";
		carro2.modelo = "Caminhonete";
		carro2.ano = 2009;
		
		System.out.println("\n Carro 1");
		System.out.println("Carro: "+carro1.nome+" Modelo: "+carro1.modelo+" ano: "+carro1.ano);
		
		System.out.println("\n Carro 2");
		System.out.println("Carro: "+carro2.nome+" Modelo: "+carro2.modelo+" ano: "+carro2.ano);

	}

}
