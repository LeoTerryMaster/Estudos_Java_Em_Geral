package Xti.threads.notifyAll;

import java.util.Random;

public class Consumidor implements Runnable{

	Ponte ponte;

	public Consumidor(Ponte ponte){
		this.ponte = ponte;
	}

	Random r = new Random();

	@Override
	public void run(){
		int total = 0;
		for (int i = 0; i < 5; i++){
			try{
				Thread.sleep(r.nextInt(3000));
				total += ponte.get();
				System.err.println(total);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
