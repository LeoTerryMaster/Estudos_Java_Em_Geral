package XTI.src.exercicios.cachorro;

public class Caachorro{

	String nome;
	String raca;
	double pesoKilo;
	String tamanho;


	public Caachorro(){

	}

	public Caachorro(String nome,String raca,double pesoKilo,String tamanho){
		this.nome = nome;
		this.raca = raca;
		this.pesoKilo = pesoKilo;
		this.tamanho = tamanho;
	}


	public String getNome(){
		return nome;
	}


	public void setNome(String nome){
		this.nome = nome;
	}


	public String getRaca(){
		return raca;
	}


	public void setRaca(String raca){
		this.raca = raca;
	}


	public double getPesoKilo(){
		return pesoKilo;
	}


	public void setPesoKilo(double pesoKilo){
		this.pesoKilo = pesoKilo;
	}


	public String getTamanho(){
		return tamanho;
	}


	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}


	@Override
	public String toString(){
		return "Caachorro [nome=" + nome + ", raca=" + raca + ", pesoKilo=" + pesoKilo + ", tamanho=" + tamanho + "]";
	}


}
