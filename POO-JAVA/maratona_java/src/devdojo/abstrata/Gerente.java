package devdojo.abstrata;
//herança com class Funcionario precisa utilizar método construtor

public class Gerente  extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}
	
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.20;
	}

	
	
}
