package academy.devdojo.maratonajava.javacore.construtores.dominio;

public class Anime {
  private String nome; 
  private String tipo;
  private int episodios;
  private String genero;
  private String estudio;
  
  //método construtor é padrão
  public Anime() {
	  System.out.println("Dentro método CONSTRUTOR");
  }
  
  
  public Anime(String nome, String tipo, int episodios, String genero) {
	this();//chamando método construtor com sobre carga método com mesmo nome
	this.nome = nome;
	this.tipo = tipo;
	this.episodios = episodios;
	this.genero = genero;
  }
  
  //criando mais um construtor com mesmo nome e adicionando mais um atributo
  public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
	this(nome, tipo, episodios, genero);//chamando método construtor com sobre carga método com mesmo nome
	this.estudio = estudio;
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
  

  
  
  public void imprime() {
	  System.out.println("Nome do anime: "+this.nome);
	  System.out.println("Tipo do anime: "+this.tipo);
	  System.out.println("Número de episódios: "+this.episodios);
	  System.out.println("Gênero é: "+this.genero);
	  System.out.println("Gênero é: "+this.estudio);
  }
}
