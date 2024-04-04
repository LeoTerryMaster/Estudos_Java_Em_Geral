package Xti.jdbc.pessoa.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecaoTeste{

	public static void main(String[] args) throws ClassNotFoundException{


		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456")){

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("Conexao ok");

	}

}
