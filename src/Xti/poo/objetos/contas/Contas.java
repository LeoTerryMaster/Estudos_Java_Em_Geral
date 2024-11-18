package Xti.poo.objetos.contas;

public class Contas{

	public String cliente;
	public double saldo;


	public void sacar(double valor){
		saldo -= valor;
	}


	
	public void depositar(double valor){
		saldo += valor;
	}
	
	
	
	public void trasnferir(Contas destino, double valor){
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	
	public void mostrarSaldo(){
		System.out.println(cliente + " seu saldo é de " + saldo + " milhões");
	}

}
