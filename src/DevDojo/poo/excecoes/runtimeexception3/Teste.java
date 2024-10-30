package DevDojo.poo.excecoes.runtimeexception3;


import java.io.FileNotFoundException;

public class Teste{

	public static void main(String[] args) throws FileNotFoundException, LoginException{
		Pessoa pessoa = new Pessoa(); // precisa ser declarado exceptions
		Funcionario funcionario = new Funcionario();// filha não precisa declarar exception

		pessoa.salvar();
		funcionario.salvar();


	}

}
