package Threads.Synchronized;

public class Synchronized_5{


	static int i = 0;

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


	public static class MeuRunnable implements Runnable{

		@Override
		public void run(){
			int j;
			synchronized(this){
				i++;
				j = i * 2;
			}

			double jElevadoA100 = Math.pow(j, 100);
			double sqrt = Math.sqrt(jElevadoA100);
			System.out.println(sqrt);


		}

	}

}
