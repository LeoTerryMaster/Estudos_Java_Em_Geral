package DevDojo.poo.orientacaoobjeto.modificadorestaticos.test;

import DevDojo.poo.orientacaoobjeto.modificadorestaticos.Carro;

public class CarroTest{


	public static void main(String[] args){


		Carro.setVelocidadeLimite(180);

		Carro fusca = new Carro();
		fusca.setNome(" Fusca Turbinado");
		fusca.setVelocidadeMaxima(1200);
		fusca.inprimir();


		Carro maverik = new Carro();
		maverik.setNome(" Maverik Turbinado");
		maverik.setVelocidadeMaxima(1200);
		maverik.inprimir();


		Carro saveiro = new Carro(" Saveiro Turbinado", 1200);
		saveiro.inprimir();

	}

}
