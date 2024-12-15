package devdojo.enumeracao2;

public class Cliente {

	
	private String nome;
	private TipoCliente tipo_cliente;
	private TipoPagamento tipopagamento;
	
	public Cliente(String nome, TipoCliente tipo_cliente, TipoPagamento tipopagamento) {
		
		this.nome = nome;
		this.tipo_cliente = tipo_cliente;
		this.tipopagamento = tipopagamento;
	}
	@Override
	public String toString() {
		return "Cliente -> nome=" + nome + ""
				+ ", tipo_cliente="+ tipo_cliente +"" 
				+ ", tipo_clienteInt="+ tipo_cliente.getVALOR()+ 
				"" + ", tipo_clienteRelatorio="+ tipo_cliente.getRelatorioPessoa()+ 
				", tipopagamento=" + tipopagamento + "<-";
	}

	

	
	
	
}
