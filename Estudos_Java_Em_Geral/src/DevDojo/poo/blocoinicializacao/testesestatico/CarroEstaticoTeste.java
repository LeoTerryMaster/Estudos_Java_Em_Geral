package DevDojo.poo.blocoinicializacao.testesestatico;

import DevDojo.poo.blocoinicializacao.CarroEstatico;

public class CarroEstaticoTeste {

    public static void main(String[] args) {
        CarroEstatico carro= new CarroEstatico("BMW", 280);
        CarroEstatico carro1= new CarroEstatico("Mercedes", 275);
        CarroEstatico carro2= new CarroEstatico("Audi", 290);

        carro1.setVelocidadLimite(180); // método normal
        CarroEstatico.setVelocidadLimite(180);// método estático
        carro.imprimir();
        carro1.imprimir();
        carro2.imprimir();

        CarroEstatico.getInstance().imprimir();
    }
}
