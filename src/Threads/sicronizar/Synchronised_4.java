package Threads.sicronizar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Synchronised_4{


	private static List<String> lista = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException{

		lista = Collections.synchronizedList(lista);

		MeuRunnable runnable = new MeuRunnable();
		Thread t0 = new Thread(runnable, "Thread 1");
		Thread t1 = new Thread(runnable, "Thread 2");
		Thread t2 = new Thread(runnable, "Thread 3");
		Thread t3 = new Thread(runnable, "Thread 4");
		Thread t4 = new Thread(runnable, "Thread 5");
		Thread t5 = new Thread(runnable, "Thread 6");

		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		Thread.sleep(500);

		System.out.println();
		System.out.println(lista + "\n");


	}

	public static class MeuRunnable implements Runnable{

		@Override
		public void run(){

			lista.add("vou ficar fera no java  \n");
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " adicionou: " + lista.get(lista.size() - 1));
		}


	}

}
