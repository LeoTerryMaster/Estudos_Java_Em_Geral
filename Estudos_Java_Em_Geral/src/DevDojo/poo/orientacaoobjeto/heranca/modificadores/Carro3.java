package DevDojo.poo.orientacaoobjeto.heranca.modificadores;


public class Carro3{

	private String nome;
	public  final double VELICIDADE_LIMITE;

	// A constante mesmo sendo inicializada pelo construtor
	public Carro3(double VELICIDADE_LIMITE){
		this.VELICIDADE_LIMITE = 250;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}
