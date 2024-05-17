package Threads.Simples;

public class Threads_1{

	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		MeuRunnbable meuRunnbable = new MeuRunnbable();

		Thread t1 = new Thread(meuRunnbable);
		System.out.println(t1.getName()+" t1 threads 1");


		Thread t2 = new Thread(new MeuRunnbable());
		t2.run();// aqui so executa na mesma trhead
//		t2.start();// nova threads


		// não podemos startar a mesma threads 2 x

		Thread t3 = new Thread(() -> System.out.println("Leandro é o melhor programador em java "));
		System.out.println(t3.getName());

		t1.start();
		t2.start();// nova threads
		t3.start();

	}

}
