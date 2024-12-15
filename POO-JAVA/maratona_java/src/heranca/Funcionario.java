package heranca;


// extende todos atributos e métodos da classe Pessoa
public class Funcionario extends Pessoa {

	private double salario;
	
	//subscrevendo o método da super classe Pessoa
	public void imprime() {
		super.imprime();//pegando o método da super classe Pessoa porque é um extends utilizando os mesmos atributos
		System.out.println("Salário .: "+this.salario);
	}
	
	public void imprimePagamento() {
		System.out.println("Pagamento pago .: " +this.salario+ " Funcionário .: "+this.nome);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
