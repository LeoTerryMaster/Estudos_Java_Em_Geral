package Xti.jdbc.pessoa.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarSql{


	public static void main(String[] args){

		String sql = "select codigo, login, password, email from banco";
		try(Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456"); PreparedStatement stm = con.prepareStatement(sql)){
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				System.out.println(rs.getLong(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println(rs.getString(4));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
