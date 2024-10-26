package exercicios.aleatorios;

public class ExercicioLife{


	static double vida = 6.048e+8;
	private static long um_minuto = 60000;

	public static void main(String[] args){

		for (double i = vida; i >= 0; i--){
			try{
				Thread.sleep(um_minuto);
				System.err.println("Tempo da vida " + i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}


	}

}
