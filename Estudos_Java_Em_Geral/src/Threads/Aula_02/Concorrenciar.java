package Threads.Aula_02;

public class Concorrenciar{

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

		@Override
		public synchronized void run(){
			i++;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + i);
		}


	}


}
