package Xti.poo.objetos.polimorfismo;

public class Animal{

	public String comida;
	public int peso;


	public Animal(){

	}

	public Animal(String comida,int peso){
		this.comida = comida;
		this.peso = peso;
	}

	public void dormir(){
		System.out.println("Dormiu!!!");
	}

	public void fazerBarulho(){
		System.out.println("Fazer barulhos......");
	}


}
