package Threads.Simples;


public class MeuRunnbable implements Runnable{

	@Override
	public void run(){
		
		String name = Thread.currentThread().getName();
		System.out.println("Olá mundo !! "+ name);
	}

}
