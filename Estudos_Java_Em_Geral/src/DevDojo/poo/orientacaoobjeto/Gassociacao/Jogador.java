package DevDojo.poo.orientacaoobjeto.Gassociacao;

public class Jogador{

	private String nome;

	public Jogador(String nome){
		this.nome = nome;
	}


	public void imprimir(){
		System.out.println(this.nome);
	}


	public String getNome(){
		return nome;
	}


	public void setNome(String nome){
		this.nome = nome;
	}


}