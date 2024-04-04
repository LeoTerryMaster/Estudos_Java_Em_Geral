package DevDojo.poo.orientacaoobjeto.pessoa.test;

import DevDojo.poo.orientacaoobjeto.pessoa.Imprimir;
import DevDojo.poo.orientacaoobjeto.pessoa.Pessoa;

public class ProfessorTest2{
	public static void main(String[] args){
		
		Pessoa professor = new Pessoa("Professor leandro", 40, 'M', "Rua regina Nº300");
		Imprimir.impreme(professor);
	}
	

}
