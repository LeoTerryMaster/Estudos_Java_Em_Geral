package XTI.src.poo.conta;

public class Contas{

	String nome;
	String cliente;
	double saldo ;



	public void sacar(double valor){
		this.saldo -= valor;
	}

	public void depositar(double valor){
		this.saldo +=valor;
	}

	public void transferePara(Contas destino, double valor){
		this.sacar(valor);
		destino.depositar(valor);
	}
	public void exiberSaldo(){
		System.out.println("O clinete " + nome + " tem saldo de " + saldo + " cliente é " + cliente);
	}

}

