package Threads.sicronizar;

public class Synchronised_3{


	static int i = 0;

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
			int j;
			synchronized(this) // synchronized colocar tudo em fila 
			{
				i++;
				j = i * 2;
				System.out.println(Thread.currentThread().getName() + " incrementou i para: " + i);


			}
			double jelevadoA10 = Math.pow(j, 10);
			double raizQuadrada = Math.sqrt(jelevadoA10);
			System.out.println("Resultado " + raizQuadrada + " é a raiz quadrada de " + jelevadoA10);
		}

		//		@Override
		//		public synchronized void run(){
		//			i++;
		//			System.out.println(Thread.currentThread().getName() + " incrementou i para: " + i);
		//		}

	}

}
