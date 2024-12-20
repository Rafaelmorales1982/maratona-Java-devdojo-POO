package academy.devdojo.maratonajava.javacore.associacao.dominio;


public class SalaoBeleza {

	private String nome;
	private FuncionariosSalao[] funcionarios;
	
	
	//construtor
	public SalaoBeleza(String nome) {
		this.nome = nome;
	}
	
	//construtor sobrecarga
	public SalaoBeleza(String nome, FuncionariosSalao[]  funcionarios) {
		
		this.nome = nome;
		this.funcionarios = funcionarios;
		
	}
	
	public void imprime() {
		System.out.println("Nome Salão.: "+this.nome);
		if(funcionarios == null) {
			return;
		}
		for (FuncionariosSalao funcionariosSalao : funcionarios) {
			System.out.println("Nome funcionário.: "+funcionariosSalao.getNome());
		}
	
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FuncionariosSalao[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(FuncionariosSalao[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	
	
	
	
	
	
	
}
