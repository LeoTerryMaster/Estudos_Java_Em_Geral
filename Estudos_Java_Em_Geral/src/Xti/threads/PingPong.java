package Xti.threads;

public class PingPong extends Thread{

	String palavras;
	long tempo;

	public PingPong(String palavra,long tempo){
		this.palavras = palavra;
		this.tempo = tempo;
	}


	public static void main(String[] args){
		new PingPong("ping", 1500).start();
		new PingPong("pong", 2500).start();
	}


	@Override
	public void run(){

		try{
			for (int i = 0; i < 5; i++){
				System.out.println(palavras);
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}
