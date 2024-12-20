package academy.devdojo.maratonajava.javacore.sobrecargametodo.dominio;

public class Anime {
  private String nome; 
  private String tipo;
  private int episodios;
  private String genero;
  
  //método construtor é padrão
  
  public Anime() {
	  
  }
  
  public void setNome(String nome) {
	  this.nome = nome;
  }
  
  public String getNome() {
	  return this.nome;
  }
  
  public void setTipo(String tipo) {
	  this.tipo = tipo;
  }
  
  public String getTipo() {
	  return this.tipo;
  }
  
  public void setEpisodios(int espisodios) {
	  this.episodios = espisodios;
  }
  
  public int getEpisodios() {
	 return this.episodios;
  }
  
  public void setGenero(String genero) {
	  this.genero = genero;
  }
  public String getGenero() {
	  return this.genero;
  }
  
  //método passando por parametro da classe AnimeTest01
  public void init(String nome, String tipo, int episodios) {
	  this.nome = nome;
	  this.tipo = tipo;
	  this.episodios = episodios;
  }
  //sobrecarga métodos com mesmo nome e com atributo a mais 
  public void init(String nome, String tipo, int episodios, String genero) {
	 this.init(nome, tipo, episodios);
	 this.genero = genero;
  }
  
  
  public void imprime() {
	  System.out.println("Nome do anime: "+this.nome);
	  System.out.println("Tipo do anime: "+this.tipo);
	  System.out.println("Número de episódios: "+this.episodios);
	  System.out.println("Gênero é: "+this.genero);
  }
}
