package DevDojo.poo.orientacaoobjeto.pessoa.test;

import DevDojo.poo.orientacaoobjeto.pessoa.Imprimir;
import DevDojo.poo.orientacaoobjeto.pessoa.Pessoa;

public class ProfessorTest1{
	public static void main(String[] args){
		
		Pessoa professor = new Pessoa();
		professor.setNome( "Professo Leandro");
		professor.setIdade( 40);
		professor.setSexo('M');
		professor.setEndereco("Rua regina Nº300");
		Imprimir.impreme(professor);
	}
	

}
