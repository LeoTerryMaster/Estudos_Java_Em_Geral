package XTI.src.poo.construtores;

public class Motor{

	public String tipo;
	public int potencia;
	public double cilindrada;


	public Motor(){

	}

	public Motor(String tipo,int potencia,double cilindrada){
		this.tipo = tipo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;

	}

	@Override
	public String toString(){

		return "Tipo: " + tipo + "\nPotência: " + potencia + " cv\nCilindrada: " + cilindrada + " L";
	}

}
