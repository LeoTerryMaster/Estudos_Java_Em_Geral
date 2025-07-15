package Threads.inicio;


public class MeuRunnable implements Runnable {

	@Override
	public void run() {
		
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " está rodando o método run() da classe MeuRunnable");
	}



}
