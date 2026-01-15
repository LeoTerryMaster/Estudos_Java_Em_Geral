package XTI.src.poo.abstratas;


// classe abstratas
public abstract class Animal{

	private double peso;
	private String comida;

	public Animal(){
		this(0, null);
	}

	public Animal(double peso,String comida){
		this.peso = peso;
		this.comida = comida;
	}


	abstract void dormi();

	abstract void fezBarulho();

	public double getPeso(){
		return peso;
	}


	public void setPeso(double peso){
		this.peso = peso;
	}


	public String getComida(){
		return comida;
	}


	public void setComida(String comida){
		this.comida = comida;
	}


	@Override
	public String toString(){
		return "Animal [peso=" + peso + ", comida=" + comida + "]";
	}


}
