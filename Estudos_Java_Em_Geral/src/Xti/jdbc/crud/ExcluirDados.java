package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Xti.jdbc.pessoa.Pessoas;

public class ExcluirDados{


	public static void excluir(Connection connection,Pessoas pessoas){
		String sql = "delete banco where codigo=?";
		try(PreparedStatement stm = connection.prepareStatement(sql);){
			stm.setLong(1, pessoas.getCodigo());
			stm.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}


}
