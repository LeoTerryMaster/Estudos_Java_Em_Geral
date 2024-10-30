package DevDojo.poo.excecoes.exceptionsMult3;


import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable{

	@Override
	public void close() throws IOException{
		System.out.println("Fechando leitor2 ");
	}
}
