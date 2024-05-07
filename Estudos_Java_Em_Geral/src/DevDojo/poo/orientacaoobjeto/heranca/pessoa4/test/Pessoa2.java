package DevDojo.poo.orientacaoobjeto.heranca.pessoa4.test;

import DevDojo.poo.orientacaoobjeto.heranca.pessoa4.Funcionario;

public class Pessoa2{


	
	// 0 - Bloco de inicialização estático da super classe é executado quento a JVM carregar a a superclass
	// 1 - Bloco de inicialização estático da superclass é executada quando a JVM carregar a classe filha
	// 2 - Alocado espaço em memória pro objeto da classe pai
	// 3 - Cada atributo de classe é criado e inicializado com valores default ou que for passado da superclass
	// 4 - Bloco de inicialização da super classe é executada
	// 5 - Construtor é executado da superclasse
	// 6 - Aloca espaço em memória pro  objeto da subclasse
	// 7 - Cada atributo de classe é criado e inicializado com valores default ou que for passado
	// 8 - Bloco de inicialização da subclasse é executada na ordem que aparece
	// 9 - Construtor é executado da superclasse
	
	public static void main(String[] args){


		Funcionario funcionario = new Funcionario("Leandro");

	}

}
