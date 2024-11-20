package atividadeteste01;

import atividade01.ImpressoraPessoa;
import atividade01.Pessoa;

public class PessoaTest01 {

	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa();
		Pessoa pessoa02 = new Pessoa();
		ImpressoraPessoa impressora = new ImpressoraPessoa();
		
		pessoa01.nome = "Gabriel Balico";
		pessoa01.idade = 14;
		pessoa01.sexo = 'M';
		
		pessoa02.nome = "Laura";
		pessoa02.idade = 6;
		pessoa02.sexo = 'F';
		
		
		System.out.println("Pessoa 01");
		impressora.impressora(pessoa01);
		
		System.out.println("Pessoa 02");
		impressora.impressora(pessoa02);
		

	}

}
