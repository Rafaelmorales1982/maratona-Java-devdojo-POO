package devdojo.abstrata;
//abstract utilizado para criar herança ou seja extender para outra classe e esta extendida para Gerente
public abstract class Funcionario  extends Pessoa{
	//protected utilizado somente na herança
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	@Override
	public void imprime() {
		System.out.println("Imprimindo...");
		
	}
	public abstract void calculaBonus();//utilizando para extender em outras classe e utilizando @Override sobescrever o método nas classes precisam
}
