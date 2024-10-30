package DevDojo.poo.excecoes.exceptionsMult4;


public class LoginException extends Exception{

	public LoginException(){
		System.out.println("Lofin inváligo");
	}

	public LoginException(String message){
		super(message);
	}

}
