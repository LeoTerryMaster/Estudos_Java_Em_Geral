package Xti.poo.objetos.galinha;

public class Galinha{

	public static int ovosDaGranja;
	public int ovos;
	public String nome;


	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}


	public void imprimir(){
		System.out.println("A galinha " + nome + " colocou " + ovos + " de ovos");
	}

	public static double mediaDeOvos(int galinha){
		return Galinha.ovosDaGranja / galinha;
	}


}
