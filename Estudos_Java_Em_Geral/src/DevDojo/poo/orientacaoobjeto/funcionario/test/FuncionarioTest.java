package DevDojo.poo.orientacaoobjeto.funcionario.test;

import java.util.Scanner;

import DevDojo.poo.orientacaoobjeto.funcionario.Funcionario;

public class FuncionarioTest{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = s.nextLine();

		System.out.print("Digite sua Idade: ");
		int idade = s.nextInt();

		System.out.print("Digite seu salário: ");
		int salario = s.nextInt();

		Funcionario funcionario = new Funcionario(nome, idade, salario);
		System.out.println(funcionario);


		s.close();
	}


}
