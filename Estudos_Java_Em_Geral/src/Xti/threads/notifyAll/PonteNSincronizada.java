package Xti.threads.notifyAll;

public class PonteNSincronizada implements Ponte{

	private int valor = -1;


	@Override
	public void set(int valor) throws InterruptedException{
		System.out.println("produziu " + valor + " ");
		this.valor = valor;
	}

	@Override
	public int get() throws InterruptedException{
		System.err.println("Consumiu " + valor + " ");
		return valor;
	}

}
