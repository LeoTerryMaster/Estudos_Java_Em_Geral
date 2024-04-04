package Xti.threads.synchronize;

public class ContaConjunta{

	private int saldo = 1000;


	public int getSaldo(){
		return saldo;
	}

	public synchronized void sacar(int valor,String clinete){

		if(saldo >= valor){
			int saldo_original = valor;
			System.out.println(clinete + " Vai sacar ");
			try{
				System.out.println(clinete + " aguardando processamento ");
				Thread.sleep(1000); // aguardando  processamento
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			saldo -= valor;
			String msg = clinete + " sacou " + valor + "[saldo original = " + saldo_original + ", saldo final = " + saldo + " ]";
			System.out.println(msg);

		}else{
			System.out.println(clinete + " Saldo insulficiente ");
		}

	}


}
