package DevDojo.poo.orientacaoobjeto.pessoa.test;

import DevDojo.poo.orientacaoobjeto.pessoa.Pessoa;
import DevDojo.poo.orientacaoobjeto.pessoa.Imprimir;

public class EstudanteTeste2{


	public static void main(String[] args){
		Pessoa estudante = new Pessoa("Leandro", 40, 'M', "Rua regina Nº300");
		Imprimir.impreme(estudante);


	}

}
