package Xti.jdbc.pessoa.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Xti.jdbc.pessoa.Pessoas;

public class Conexao{

	public static void conexao(Pessoas pessoas){

		String sql = "insert into banco values (?,?,?,?)";
		try(Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456"); PreparedStatement stm = con.prepareStatement(sql)){
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
