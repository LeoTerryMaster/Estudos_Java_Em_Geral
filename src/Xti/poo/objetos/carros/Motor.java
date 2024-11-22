package Xti.poo.objetos.carros;


public class Motor{

	public String tipo;
	public int potencia;
	
	public Motor(){
	}
	public Motor(String tipo,int potencia){
		super();
		this.tipo = tipo;
		this.potencia = potencia;
	}
	@Override
	public String toString(){
		return "Motor [tipo=" + tipo + ", potencia=" + potencia + "]";
	}
	
	
	
	
	
}
