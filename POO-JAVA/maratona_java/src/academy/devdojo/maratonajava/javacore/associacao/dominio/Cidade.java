package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Cidade {
	private String nomeCidade;
	private String estado;
	
	
	
	
	public Cidade(String nomeCidade, String estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}




	public String getNomeCidade() {
		return nomeCidade;
	}




	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
