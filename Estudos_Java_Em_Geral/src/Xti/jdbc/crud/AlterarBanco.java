package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Xti.jdbc.pessoa.Pessoas;

public class AlterarBanco{


	public static void alterar(Connection connection,Pessoas pessoas){
		String sql = "update banco set login=?,password=?,email=? where codigo=?";
		try(PreparedStatement stm = connection.prepareStatement(sql);){
			stm.setString(1, pessoas.getLogin());
			stm.setLong(2, pessoas.getPassword());
			stm.setString(3, pessoas.getEmail());
			stm.setLong(4, pessoas.getCodigo());
			stm.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
