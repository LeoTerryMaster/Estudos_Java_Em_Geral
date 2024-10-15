package DevDojo.poo.modificadores.primitivos.Testes;

import DevDojo.poo.modificadores.primitivos.Carros;

public class CarroTeste {

    public static void main(String[] args) {
        Carros carros= new Carros();

        double velocidadeLimite = carros.VELOCIDADE_LIMITE;

        System.out.println(velocidadeLimite);
    }

}
