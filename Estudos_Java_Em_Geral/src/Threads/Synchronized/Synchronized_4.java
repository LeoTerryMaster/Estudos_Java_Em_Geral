package Threads.Synchronized;

public class Synchronized_4{


	static int i = -1;

	public static void main(String[] args){


		MeuRunnable runnables = new MeuRunnable();

		Thread t0 = new Thread(runnables);
		Thread t1 = new Thread(runnables);
		Thread t2 = new Thread(runnables);
		Thread t3 = new Thread(runnables);
		Thread t4 = new Thread(runnables);


		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}


	public static void imprimir(){
		synchronized(Synchronized_4.class){
			i++;
			String nome = Thread.currentThread().getName();
			System.out.println(nome + " :" + i);
		}

	}

	public static class MeuRunnable implements Runnable{

		@Override
		//		public synchronized void run(){
		public void run(){
			imprimir();
		}

	}

}
