package DevDojo.poo.orientacaoobjeto.modificadorestaticos;

public class Carro{


	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;


	public Carro(){

	}

	public Carro(String nome,double velocidadeMaxima){
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}


	public void inprimir(){

		System.out.println(" ===========================");
		System.out.println("  Velocidade Máxima " + velocidadeMaxima);
		System.out.println("  Velocidade Limite " + Carro.velocidadeLimite);
		System.out.println(" ===========================");
		System.out.println();
	}


	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static double getVelocidadeLimite(){
		return Carro.velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite){
		Carro.velocidadeLimite = velocidadeLimite;
	}


}
