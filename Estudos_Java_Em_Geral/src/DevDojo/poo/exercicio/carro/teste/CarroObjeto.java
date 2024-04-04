package DevDojo.poo.exercicio.carro.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

import DevDojo.poo.exercicio.carro.Carro;
import DevDojo.poo.exercicio.carro.banco.BancoDeDados;

public class CarroObjeto{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.print("digite o nome do carro: ");
		String nome = s.next();

		System.out.print("Digite o modelo: ");
		String modelo = s.next();

		System.out.print("Digite o Ano:");
		int ano = s.nextInt();

		Carro carro = new Carro();
		carro.setNome(nome);
		carro.setModelo(modelo);
		carro.setAno(ano);

		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_dev_dojo", "root", "123456")){
			BancoDeDados.inserir(connection, carro);
			System.err.println("Dados inseridos");
		}catch(Exception e){
			e.printStackTrace();
		}

		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/estudos_dev_dojo", "root", "123456")){
			List<Carro> ler = BancoDeDados.ler(connection);
			for (Carro c : ler){
				System.out.println(c);
			}
			System.err.println("Dados lidos");
		}catch(Exception e){
			e.printStackTrace();
		}
		s.close();
	}

}
