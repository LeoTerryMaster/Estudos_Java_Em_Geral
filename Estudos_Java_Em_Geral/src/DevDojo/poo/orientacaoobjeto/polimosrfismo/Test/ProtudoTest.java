package DevDojo.poo.orientacaoobjeto.polimosrfismo.Test;


import DevDojo.poo.orientacaoobjeto.polimosrfismo.CalcularImpostos;
import DevDojo.poo.orientacaoobjeto.polimosrfismo.Computador;
import DevDojo.poo.orientacaoobjeto.polimosrfismo.Tomate;

public class ProtudoTest {

    public static void main(String[] args) {
        Computador comprador= new Computador("Mac",1200);

        Tomate tomate= new Tomate("Tomates",6.50);

    comprador.calcularImposto();
    tomate.calcularImposto();

        CalcularImpostos.calcularImpostosComputador(comprador);
        System.out.println("=============================");
        CalcularImpostos.calcularImpostoTomate(tomate);


    }
}
