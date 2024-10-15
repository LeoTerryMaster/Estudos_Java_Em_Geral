package Threads.Aula_01;

public class MeuRunnable implements Runnable{

	@Override
	public void run(){

		System.out.println("Olá Threads... ");
		System.out.println("Nome da segunda Threads = " + Thread.currentThread().getName());
		System.out.println("Id da Threads = " + Thread.currentThread().getId());

		System.out.println("\n");
	}


}
