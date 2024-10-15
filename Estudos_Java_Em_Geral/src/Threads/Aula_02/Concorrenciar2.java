package Threads.Aula_02;

public class Concorrenciar2{

	static int i = -1;

	public static void main(String[] args){

		MeuRunnable nuRunnable = new MeuRunnable();

		Thread t0 = new Thread(nuRunnable);
		Thread t1 = new Thread(nuRunnable);
		Thread t2 = new Thread(nuRunnable);
		Thread t3 = new Thread(nuRunnable);
		Thread t4 = new Thread(nuRunnable);


		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}


	public static class MeuRunnable implements Runnable{

		static Object lock1 = new Object();
		static Object lock2 = new Object();


		@Override
		public synchronized void run(){

			synchronized(lock1){
				i++;
				String name = Thread.currentThread().getName();
				System.out.println(name + " : " + i);
			}

			System.out.println();
			
			synchronized(lock2){
				i++;
				String name = Thread.currentThread().getName();
				System.out.println(name + " : " + i);
			}

		}


	}


}
