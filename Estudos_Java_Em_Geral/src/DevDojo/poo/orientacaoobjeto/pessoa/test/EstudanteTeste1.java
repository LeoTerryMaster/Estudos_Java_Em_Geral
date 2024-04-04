package DevDojo.poo.orientacaoobjeto.pessoa.test;

import DevDojo.poo.orientacaoobjeto.pessoa.Pessoa;
import DevDojo.poo.orientacaoobjeto.pessoa.Imprimir;

public class EstudanteTeste1{


	public static void main(String[] args){
		Pessoa estudante = new Pessoa();
		estudante.setNome( "Leandro");
		estudante.setIdade( 40);
		estudante.setSexo('M');
		estudante.setEndereco("Rua regina Nº300");
		Imprimir.impreme(estudante);

		
		
	}

}
