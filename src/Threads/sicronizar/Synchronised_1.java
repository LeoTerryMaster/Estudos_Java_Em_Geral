package Threads.sicronizar;

public class Synchronised_1{


	static int i = -1;

	public static void main(String[] args){

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


	}

	public static class MeuRunnable implements Runnable{

		@Override
		public void run(){
			synchronized(this) // synchronized colocar tudo em fila 
			{
				i++;
				System.out.println(Thread.currentThread().getName() + " incrementou i para: " + i);
			}
		}

//		@Override
//		public synchronized void run(){
//			i++;
//			System.out.println(Thread.currentThread().getName() + " incrementou i para: " + i);
//		}

	}

}
