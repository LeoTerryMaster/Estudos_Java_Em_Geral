package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Xti.jdbc.pessoa.Pessoas;

public class ObjetoTeste{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		System.out.print("Digite o ID: ");
		long resultado1 = s.nextLong();

		System.out.print("Digite seu  Login: ");
		String resultado2 = s.next();

		System.out.print("Digite sua Senha: ");
		long resultado3 = s.nextLong();

		System.out.print("Digite seu email: ");
		String resultado4 = s.next();


		Pessoas pessoas = new Pessoas();
		pessoas.setCodigo(resultado1);
		pessoas.setLogin(resultado2);
		pessoas.setPassword(resultado3);
		pessoas.setEmail(resultado4);

		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456")){
			ContaCrud.criar(connection, pessoas);

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("Dados inseridos");

		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456")){
			List<Pessoas> lerpessoas = LerBanco.ler(connection);
			for (Pessoas p : lerpessoas){
				System.out.println(p);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("Dados Lidos");
		s.close();
	}


}
