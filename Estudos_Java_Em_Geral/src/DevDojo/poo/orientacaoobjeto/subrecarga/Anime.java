package DevDojo.poo.orientacaoobjeto.subrecarga;

public class Anime{

	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private int horas;

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
		System.out.println("\n");
	}

}
