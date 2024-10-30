package DevDojo.poo.polimorfismo.poli1.testes;

import DevDojo.poo.polimorfismo.poli1.Computador;
import DevDojo.poo.polimorfismo.poli1.Tomate;
import DevDojo.poo.polimorfismo.poli1.servicos.CalcularImposto;

public class ProdutosTestes {

    public static void main(String[] args) {
        Computador computador= new Computador("I12", 1500);

        Tomate tomate= new Tomate("Cipriano", 1.22);

        CalcularImposto.CalculandoImposto(computador);
        System.out.println("====================================");
        CalcularImposto.CalculandoImposto(tomate);


    }



}
