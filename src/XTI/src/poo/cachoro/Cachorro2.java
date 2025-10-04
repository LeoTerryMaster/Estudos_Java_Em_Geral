package XTI.src.poo.cachoro;

public class Cachorro2{

	int tamanho;
	String raca;
	String nome;


	public Cachorro2(int tamanho,String raca,String nome){
		this.tamanho = tamanho;
		this.raca = raca;
		this.nome = nome;
	}


	public int getTamanho(){
		return tamanho;
	}


	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}


	public String getRaca(){
		return raca;
	}


	public void setRaca(String raca){
		this.raca = raca;
	}


	public String getNome(){
		return nome;
	}


	public void setNome(String nome){
		this.nome = nome;
	}


	public void latir(){
		System.out.println("O cachorro " + nome + " da raça " + raca + " latiu, ele era do tamanho de " + tamanho);
	}


	@Override
	public String toString(){
		return "Cachorro2 [tamanho=" + tamanho + ", raca=" + raca + ", nome=" + nome + "]";
	}

	
	

}
