package Theads.Simples;

public class Threads_1{


	// Tendo noção que a primeira Thread é todo esse código dentro desse método

	public static void main(String[] args){


		
		MeuRinnbale meuRinnbale= new MeuRinnbale();
		
		// Threads principal 
		Thread t = Thread.currentThread();

		System.out.println("Nome da Thread's " + t.getName()); // no getname eu consigo saber o nome da Threads que esta sendo executada
		System.out.println("Id da Thread's " + t.getId()); // getId eu consigo saber quantas Treads tenho sendo executadas


		// Segunda & Terceira Thread é o códogo criado dentro do método
		Thread t2 = new Thread(meuRinnbale);
		//t2.run(); // arenas exeecutando na mesma Thread
		t2.start(); // Executa em uma nova Thread

		Thread t3 = new Thread(meuRinnbale);
		t3.start();


		// Runnable como lambda
		Thread t4 = new Thread(() -> System.out.println("\nOlá mundo, funçao Lambda "+ Thread.currentThread().getName()));
		t4.start();
		//t4.start(); Não pode usar o método start mais de uma vez na mesma Thread
		
		System.out.println();
		Thread t5 = new Thread(new MeuRinnbale());
		t5.start();



	}



}
