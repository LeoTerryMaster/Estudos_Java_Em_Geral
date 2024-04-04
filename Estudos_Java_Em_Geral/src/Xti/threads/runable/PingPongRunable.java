package Xti.threads.runable;

public class PingPongRunable implements Runnable{

	String palavras;
	long tempo;

	public PingPongRunable(String palavra,long tempo){
		this.palavras = palavra;
		this.tempo = tempo;
	}


	public static void main(String[] args){
		Runnable ping= 	new PingPongRunable("ping", 1500);
		Runnable pong= 	new PingPongRunable("pong", 1500);
		
		new Thread(ping,"ping").start();
		new Thread(pong,"pong").start();
	}


	@Override
	public void run(){

		try{
			for (int i = 0; i < 15; i++){
				System.out.println(palavras);
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}


	

}
