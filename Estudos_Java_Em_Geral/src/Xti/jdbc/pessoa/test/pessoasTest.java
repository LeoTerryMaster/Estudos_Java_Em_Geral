package Xti.jdbc.pessoa.test;

import java.util.Scanner;

import Xti.jdbc.pessoa.Pessoas;

public class pessoasTest extends Conexao{


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
		Conexao.conexao(pessoas);
		System.out.println("Dados inseridos");

		s.close();
	}


}
