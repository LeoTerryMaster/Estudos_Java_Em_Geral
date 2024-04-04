package Xti.threads.synchronize;

public class Compras implements Runnable{


	ContaConjunta conta = new ContaConjunta();


	public static void main(String[] args){

		Compras isCompras = new Compras();

		new Thread(isCompras, "Pai").start();
		new Thread(isCompras, "Mae").start();
		new Thread(isCompras, "Filha").start();
		new Thread(isCompras, "Filho").start();
	}


	@Override
	public  void run(){
		String cliente = Thread.currentThread().getName();

		for (int i = 0; i < 5; i++){
			conta.sacar(15, cliente);
			if(conta.getSaldo() < 0){
				System.out.println("Acabou o dinheiro");
			}
		}



	}


}
