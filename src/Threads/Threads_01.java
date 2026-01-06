package Threads;

public class Threads_01{


	public static void main(String[] args){

		Thread t = Thread.currentThread();
		System.out.println("Threads 01 " + t.getName());


		MeuRunnable runnas= new MeuRunnable();
		
		// novo obj 
		Thread t1 = new Thread(runnas);
		t1.run();// só novo obj (executando na mesma threads)
		t1.start();// nova thread (executando uma nova thread)


		Thread t2 = new Thread(() -> System.out.println("Vou ficar foda no java!!!"));
		t2.start();
//		t2.start(); // nao consegue startar 2x a mesma thread 
		
		
		// várias threads
		Thread t3 = new Thread(runnas);
		t3.start();// nova thread (executando uma nova thread)
		
	}

}
