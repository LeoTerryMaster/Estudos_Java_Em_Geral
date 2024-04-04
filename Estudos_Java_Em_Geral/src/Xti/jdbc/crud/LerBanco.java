package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Xti.jdbc.pessoa.Pessoas;

public class LerBanco{

	public static List<Pessoas> ler(Connection connection){
		List<Pessoas> lista = new ArrayList<>();
		String sql = "select codigo,login,password,email from banco";
		try(PreparedStatement stm = connection.prepareStatement(sql);){
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				lista.add(new Pessoas(rs.getLong(1), rs.getString(2), rs.getLong(3), rs.getNString(4)));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return lista;
	}

}
