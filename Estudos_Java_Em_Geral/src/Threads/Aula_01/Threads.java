package Threads.Aula_01;


public class Threads{

	
	public static void main(String[] args){
		
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
		
		System.out.println();
		
		Thread t1 = new Thread(new MeuRunnable());
//		t1.run();
		t1.start();
		
	}
}
