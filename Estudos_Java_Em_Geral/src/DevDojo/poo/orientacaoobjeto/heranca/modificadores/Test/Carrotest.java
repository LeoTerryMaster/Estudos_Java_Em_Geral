package DevDojo.poo.orientacaoobjeto.heranca.modificadores.Test;


import DevDojo.poo.orientacaoobjeto.heranca.modificadores.Carro;
import DevDojo.poo.orientacaoobjeto.heranca.modificadores.Ferrari;

public class Carrotest{

	public static void main(String[] args){
		Carro carro= new Carro();
		carro.setNome("Maverik");
		System.out.println(	Carro.VELICIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Leandro");
		System.out.println(carro.COMPRADOR);

		Ferrari ferrari= new Ferrari();
		ferrari.setNome("Bugati");
		ferrari.imprimir();


	}
}
