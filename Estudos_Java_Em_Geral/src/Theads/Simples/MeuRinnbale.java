package Theads.Simples;

public class MeuRinnbale implements Runnable{

	@Override
	public void run(){

		System.out.println( );
		System.out.println("Olá Mundo!!");

		System.out.println( );
		Thread t = Thread.currentThread();
		System.out.println("Nome da Thread " + t.getName());
	}

}
