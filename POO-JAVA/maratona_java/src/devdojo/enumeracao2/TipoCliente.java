package devdojo.enumeracao2;

public enum TipoCliente {
	PESSOA_JURIDICA(1, "Pessoa Jurídica"),
	PESSOA_FISICA(2, "Pessoa Física");
	
	//tipo variável constante
	private  final int VALOR;
	private String relatorioPessoa;
	
	

	private TipoCliente(int valor, String relatorioPessoa) {
		this.VALOR = valor;
		this.relatorioPessoa = relatorioPessoa;
	}

	public int getVALOR() {
		return VALOR;
	}

	public String getRelatorioPessoa() {
		return relatorioPessoa;
	}


	
	
	

}
