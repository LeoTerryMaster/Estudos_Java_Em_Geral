package DevDojo.poo.orientacaoobjeto.seminarios.test;

import DevDojo.poo.orientacaoobjeto.seminarios.Seminario;

public class Alunos{

	private String nome;
	private int indade;
	private Seminario seminario;

	public Alunos(String nome,int indade){
		this.nome = nome;
		this.indade = indade;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getIndade(){
		return indade;
	}

	public void setIndade(int indade){
		this.indade = indade;
	}

	public Seminario getSeminario(){
		return seminario;
	}

	public void setSeminario(Seminario seminario){
		this.seminario = seminario;
	}


}
