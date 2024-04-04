package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Xti.jdbc.pessoa.Pessoas;

public class ContaCrud{


	public static void criar(Connection connection,Pessoas pessoas){
		String sql = "insert into banco values (?,?,?,?)";
		try(PreparedStatement stm = connection.prepareStatement(sql);){
			stm.setLong(1, pessoas.getCodigo());
			stm.setString(2, pessoas.getLogin());
			stm.setLong(3, pessoas.getPassword());
			stm.setString(4, pessoas.getEmail());
			stm.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

	
	
	
	
	
}
