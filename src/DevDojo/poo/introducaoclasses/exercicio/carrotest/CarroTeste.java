package DevDojo.poo.introducaoclasses.exercicio.carrotest;

import DevDojo.poo.introducaoclasses.exercicio.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        System.out.println("====================================================");
        Carro carro = new Carro("Maverik", "Ford", 1984);
        System.out.println(carro);

        System.out.println("====================================================");
        Carro carro1 = new Carro();
        carro1.setNome("Fusca");
        carro1.setModelo("Ford");
        carro1.setAno(1984);
        System.out.println(carro1);
        System.out.println("====================================================");
    }
}
