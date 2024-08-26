package DevDojo.poo.excecoes.exceptionsMult4;


import java.util.Scanner;

public class LoginInvaligoException{

	public static void main(String[] args){
		try{
			logar();
		}catch(LoginException e){
			e.printStackTrace();
		}
	}


	private static void logar() throws LoginException{

		Scanner s = new Scanner(System.in);
		String userSenha = "Leandro";
		String senhaDV = "1234";

		System.out.print("Digite Login: ");
		String login = s.nextLine();

		System.out.print("Digite a senha: ");
		String senha = s.nextLine();
		if(!login.equals(userSenha) || !senha.equals(senhaDV)){
			throw new LoginException("Usuário errado!!!  ");
		}
		System.out.println("Usuário Logado com Sucesso!!!");

	}

}
