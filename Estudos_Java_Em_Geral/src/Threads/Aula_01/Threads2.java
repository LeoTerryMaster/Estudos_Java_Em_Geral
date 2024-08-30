package Threads.Aula_01;

public class Threads2{


	public static void main(String[] args){

		Thread t = Thread.currentThread();
		System.out.println("Thread princial " + t.getName());
		System.out.println(t.getId());
		System.out.println("\n");


		Thread t1 = new Thread(new MeuRunnable());
		//		t1.run();
		t1.start();

		Thread t2 = new Thread(() -> System.out.println("\n" + "Vou ficar esperto no java"));
		t2.start();
		//		t2.start(); // não é permitido inciar a mesma thread 
		System.out.println("Terceira Thread " + t2.getName() + " " + t2.getId());


		Thread t3 = new Thread(new MeuRunnable());
		//		t1.run();
		t3.start();

		System.out.println("Quarta Thread " + t3.getName() + " " + t3.getId());

	}

}
