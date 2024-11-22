package Xti.poo.objetos.carros;

public class Carros{

	public String modelo;
	public int velocidadeMaxima;
	public double segundosDeZeroACem;
	public Motor motor;


	public Carros(){
	}

	public Carros(String modelo,int velocidadeMaxima,double segundosDeZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosDeZeroACem = segundosDeZeroACem;
	}



	public Carros(String modelo,int velocidadeMaxima,double segundosDeZeroACem,Motor motor){
		super();
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosDeZeroACem = segundosDeZeroACem;
		this.motor = motor;
	}

	@Override
	public String toString(){
		return "Carros [modelo=" + modelo + ", velocidadeMaxima=" + velocidadeMaxima + ", segundosDeZeroACem=" + segundosDeZeroACem + "]";
	}


}
