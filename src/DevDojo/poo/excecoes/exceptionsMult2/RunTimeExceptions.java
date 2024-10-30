package DevDojo.poo.excecoes.exceptionsMult2;


import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptions{


	public static void main(String[] args){
		/*
		 * Exeções mais genéricas tem que ser escritas no final
		 * */

		try{
			throw new RuntimeException();
		}catch(ArrayIndexOutOfBoundsException |IllegalAccessError e){
			System.out.println("dentro de ArrayIndexOutOfBoundsException");
		}catch(RuntimeException s){
			System.out.println("dentro de RuntimeException");
		}


		try{
			talvezLnceExceptions();
		}catch(SQLException | FileNotFoundException e){
			e.printStackTrace();
		}


	}


	private static void talvezLnceExceptions() throws SQLException, FileNotFoundException{

	}

}
