package Threads.inicio;

public class Threas_1{


	public static void main(String[] args){

		Thread t = Thread.currentThread();
		System.out.println("Nome:  " + t.getName()); // Nome da thread atual
		System.out.println(t.getId()); // ID da thread
		System.out.println(t.getPriority()); // Prioridade da thread
		System.out.println(t.getState()); // Estado da thread
		System.out.println(t.isAlive()); // Verifica se a thread está viva
		System.out.println(t.isDaemon()); // Verifica se a thread é uma thread daemon
		System.out.println(t.isInterrupted()); // Verifica se a thread foi interrompida
		System.out.println(t.getThreadGroup()); // Grupo da thread
		System.out.println(t.getContextClassLoader()); // Carregador de classe da thread
		System.out.println(t.getStackTrace()); // Pilha de execução da thread
		System.out.println(t.getUncaughtExceptionHandler()); // Manipulador de exceção não capturada da thread


		System.out.println();
		Thread t1 = new Thread(new MeuRunnable());
		t1.run(); // executa o método run() da classe MeuRunnable, mas não inicia uma nova thread	
		System.out.println(t1.getName()); // Nome da thread t1
		System.out.println(t1.getId()); // ID da thread t1
		t1.start(); // Inicia a thread, chamando o método run() da classe MeuRunnable


		System.out.println();
		Thread t2 = new Thread(() -> System.out.println("Quero ficar rico! E especialista em Threads !!!  (java )"));
		System.out.println(t2.getName()); // Nome da thread t1
		System.out.println(t2.getId()); // ID da thread t1
		t2.start(); // Inicia a thread com uma expressão lambda que imprime uma mensagem

	}

}
