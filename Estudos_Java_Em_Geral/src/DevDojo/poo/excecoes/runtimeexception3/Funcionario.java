package DevDojo.poo.excecoes.runtimeexception3;


import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

	@Override
	public void salvar() {
		System.out.println("Salvando funcionário ");
	}

}
