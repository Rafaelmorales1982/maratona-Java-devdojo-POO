package heranca.test;


import heranca.Endereco;
import heranca.Funcionario;
import heranca.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua José Mantuani, n° 1516");
		endereco.setCep("87970-000");
		
		Endereco endereco2 = new Endereco();
		endereco2.setRua("Rua Dante Pasqualeto, n° 518");
		endereco2.setCep("87960-000");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rafael Morales");
		pessoa.setCpf("037.737.489-06");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Elaine Balico");
		funcionario.setCpf("056.055.059-22");
		funcionario.setEndereco(endereco2);
		funcionario.setSalario(5000);
		
		System.out.println("----------------Funcionário--------------");
		funcionario.imprime();
		System.out.println("----------------------Pagamento----------");
		funcionario.imprimePagamento();
		
	}
 
}
