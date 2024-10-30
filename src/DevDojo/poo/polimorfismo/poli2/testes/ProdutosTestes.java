package DevDojo.poo.polimorfismo.poli2.testes;

import DevDojo.poo.polimorfismo.poli2.Computador;
import DevDojo.poo.polimorfismo.poli2.Produto;
import DevDojo.poo.polimorfismo.poli2.Tomate;
import DevDojo.poo.polimorfismo.poli2.servicos.CalcularImposto;

public class ProdutosTestes {

    public static void main(String[] args) {
        Computador computador = new Computador("I12", 15000);

        Tomate tomate = new Tomate("Cipriano", 1.22);
        tomate.setDataValidade("10/10/24");
        CalcularImposto.CalculandoImposto(computador);
        System.out.println("====================================");
        CalcularImposto.CalculandoImposto(tomate);
        System.out.println("Data de validade " + tomate.getDataValidade());


    }


}
