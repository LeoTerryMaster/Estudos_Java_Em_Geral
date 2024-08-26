package DevDojo.poo.excecoes.exceptionsMult;


import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptions{


	public static void main(String[] args){
		/*
		 * Exeções mais genéricas tem que ser escritas no final
		 * */

		try{
			throw new RuntimeException();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("dentro de ArrayIndexOutOfBoundsException");
		}catch(IllegalAccessError s){
			System.out.println("dentro de IllegalAccessError");
		}catch(RuntimeException s){
			System.out.println("dentro de RuntimeException");
		}


		try{
			talvezLnceExceptions();
		}catch(SQLException e){
		}
		catch(FileNotFoundException e){

		}


	}


	private static void talvezLnceExceptions() throws SQLException, FileNotFoundException{

	}

}
