package DevDojo.poo.orientacaoobjeto.construtores;

public class Anime2{

	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private int horas;
	private String estudio;


	// construtor vazio o java cosntrui automaticamente
	public Anime2(){
	}


	public Anime2(String nome,String tipo,int episodios,String genero,int horas){
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
		this.horas = horas;
	}


	public Anime2(String nome,String tipo,int episodios,String genero,int horas,String estudio){
		this(nome, tipo, episodios, genero, horas);
		this.estudio = estudio;
	}

	public void init(String nome,String tipo,int episodios){
		init(nome, tipo, episodios, null);
	}


	public void init(String nome,String tipo,int episodios,String genero){
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}

	public void init(String nome,String tipo,int episodios,String genero,int horas){
		this.init(nome, tipo, episodios, genero);
		this.horas = horas;
	}


	public void imprimir(){
		System.out.println("Nomde é : " + nome);
		System.out.println("Tipo de episodio " + tipo);
		System.out.println("Quantidade de episodios " + episodios);
		System.out.println("Qual gênero " + genero);
		System.out.println("Quantidades de horas  " + horas);
		System.out.println("Estudio é :   " + estudio);
		System.out.println("\n");
	}


	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public int getEpisodios(){
		return episodios;
	}

	public void setEpisodios(int episodios){
		this.episodios = episodios;
	}


	public String getNome(){
		return nome;
	}


	public void setNome(String nome){
		this.nome = nome;
	}


	public String getGenero(){
		return genero;
	}


	public void setGenero(String genero){
		this.genero = genero;
	}


	public int getHoras(){
		return horas;
	}


	public void setHoras(int horas){
		this.horas = horas;
	}


	public String getEstudio(){
		return estudio;
	}


	public void setEstudio(String estudio){
		this.estudio = estudio;
	}


}
