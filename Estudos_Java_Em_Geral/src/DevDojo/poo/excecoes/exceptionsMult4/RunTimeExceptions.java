package DevDojo.poo.excecoes.exceptionsMult4;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RunTimeExceptions{


	public static void main(String[] args){
		lerArquivos();
	}


	public static void lerArquivos(){

		try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

		}catch(IOException e){
			e.printStackTrace();
		}


	}

	public static void lerArquivos2(){
		Reader reader = null;
		try{
			reader = new BufferedReader(new FileReader("teste.txt"));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally{
			try{

				if(reader != null){
					reader.close();
				}
			}catch(IOException e){
				throw new RuntimeException(e);
			}
		}

	}

}
