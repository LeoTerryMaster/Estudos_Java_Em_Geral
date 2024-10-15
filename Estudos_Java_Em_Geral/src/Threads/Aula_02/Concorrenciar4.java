package Threads.Aula_02;

public class Concorrenciar4{

	static int i = 0;

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

		//		@Override
		//		public synchronized void run(){
		//			i++;
		//			String name = Thread.currentThread().getName();
		//			System.out.println(name + " : " + i);
		//		}


		@Override
		public synchronized void run(){
			int j;
			synchronized(this){
				i++;
				j = i * 2;

			}

			double elevadoA100 = Math.pow(j, 100);
			double sqrt = Math.sqrt(elevadoA100);
			System.out.println(sqrt);
		}

	}


}
