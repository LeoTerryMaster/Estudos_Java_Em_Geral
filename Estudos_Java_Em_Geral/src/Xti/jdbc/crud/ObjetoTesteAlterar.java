package Xti.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Xti.jdbc.pessoa.Pessoas;

public class ObjetoTesteAlterar{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		

		System.out.print("Digite seu  Login: ");
		String resultado1 = s.next();

		System.out.print("Digite sua Senha: ");
		long resultado2 = s.nextLong();

		System.out.print("Digite seu email: ");
		String resultado3 = s.next();

		System.out.print("Digite o ID: ");
		long resultado4 = s.nextLong();

		Pessoas pessoas = new Pessoas();
		pessoas.setLogin(resultado1);
		pessoas.setPassword(resultado2);
		pessoas.setEmail(resultado3);
		pessoas.setCodigo(resultado4);


		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_xti", "root", "123456")){

			AlterarBanco.alterar(connection, pessoas);
			System.out.println("\nConta Alterada \n");


			List<Pessoas> lerpessoas = LerBanco.ler(connection);
			for (Pessoas p : lerpessoas){
				System.out.println(p);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("\nDados Lidos\n ");
		s.close();
	}


}
