package devdojo.enumeracao;

public class Cliente {
	
	private String nome;
	
	private TipoCliente tipo_cliente;

	public Cliente(String nome, TipoCliente tipo_cliente) {
		
		this.nome = nome;
		this.tipo_cliente = tipo_cliente;
	}
	
	
	

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo_cliente=" + tipo_cliente + "]";
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(TipoCliente tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
	
	
	

	
	
	
}
