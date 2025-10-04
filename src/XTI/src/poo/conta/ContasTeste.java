package XTI.src.poo.conta;

public class ContasTeste{


	public static void main(String[] args){


		Contas contas = new Contas();
		contas.nome = "Leandro";
		contas.cliente = "Vip";
		contas.saldo = 50.000;
		contas.exiberSaldo();


		System.out.println("Foi sacado 1000");
		contas.sacar(1.000);
		contas.exiberSaldo();

		System.out.println("foi depositado 15000");
		contas.depositar(15.000);
		contas.exiberSaldo();


		Contas conta2 = new Contas();
		conta2.nome = "Pedro";
		conta2.cliente = "Vip";
		conta2.saldo = 50.000;
		conta2.exiberSaldo();


		System.out.println("Foi sacado 1000");
		conta2.sacar(1.000);
		conta2.exiberSaldo();

		System.out.println("foi depositado 15000");
		conta2.depositar(15.000);
		conta2.exiberSaldo();

		System.out.println();
		System.err.println("Leandro transfere para pedro");
		conta2.transferePara(contas, 25.000);


		System.out.println();
		System.out.println("resultado de trasnferencia");
		conta2.exiberSaldo();
		contas.exiberSaldo();

	}

}
