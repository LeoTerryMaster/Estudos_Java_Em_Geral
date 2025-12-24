package XTI.src.poo.construtores;

public class Carro{

	public String modelo;
	public int vlocidadeMaxima;
	public double segundosZeroACem;

	Motor motor;


	public Carro(){

	}


	public Carro(String modelo,int vlocidadeMaxima,double segundosZeroACem){
		this.modelo = modelo;
		this.vlocidadeMaxima = vlocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;

	}

	public Carro(String modelo,int vlocidadeMaxima,double segundosZeroACem,Motor motor){
		this.modelo = modelo;
		this.vlocidadeMaxima = vlocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;

	}


	@Override
	public String toString(){
		return "Modelo: " + modelo + "\nVelocidade Máxima: " + vlocidadeMaxima + " km/h\n0 a 100 km/h em: " + segundosZeroACem + " segundos";
	}


	
	public Motor getMotor(){
		return motor;
	}


	
	public void setMotor(Motor motor){
		this.motor = motor;
	}
	
	


}
