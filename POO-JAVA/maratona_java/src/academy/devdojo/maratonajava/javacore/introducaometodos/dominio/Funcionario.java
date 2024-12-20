package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {

	public String nome;
	public int idade;
	public double salarios[];

	public void imprime() {
		System.out.println("Nome funcionário: "+this.nome);
		System.out.println("idade funcionário: "+this.idade);
	    mapearSalarios();
		System.out.println("\n Média salarial: "+String.format(nome, calcularMedia()));
	}
	
	public void mapearSalarios() {
		for (double qtdSalarios : salarios) {
			System.out.printf("\n Salario: " + String.format("%.2f", qtdSalarios));
		}
		
	}
	
	public double calcularMedia() {
		double valor = 0;
		for(double media : salarios) {
			valor += media / salarios.length;
			
		}
		return valor;
		
	}
	
	
}
