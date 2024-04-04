package DevDojo.poo.exercicio.carro.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DevDojo.poo.exercicio.carro.Carro;

public class BancoDeDados{


	public static void inserir(Connection connection,Carro carro){
		String sql = "insert into carro values (?,?,?)";

		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.setString(1, carro.getNome());
			stm.setString(2, carro.getModelo());
			stm.setInt(3, carro.getAno());
			stm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void alterar(Connection connection,Carro carro){
		String sql = "update carro set nome=?,modelo=? where ano=?";
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.setString(1, carro.getNome());
			stm.setString(2, carro.getModelo());
			stm.setInt(3, carro.getAno());
			stm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static List<Carro> ler(Connection connection){
		List<Carro> lista = new ArrayList<>();
		String sql = "select nome, modelo, ano from carro";
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				lista.add(new Carro(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return lista;
	}

}
