package Xti.threads.notifyAll;

import java.util.Random;

public class Produtor implements Runnable{

	Ponte ponte;

	public Produtor(Ponte ponte){
		this.ponte = ponte;
	}

	Random r = new Random();

	@Override
	public void run(){
		int total = 0;
		for (int i = 0; i < 5; i++){
			try{
				Thread.sleep(r.nextInt(3000));
				total += i;
				ponte.set(i);
				System.out.println(total);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
