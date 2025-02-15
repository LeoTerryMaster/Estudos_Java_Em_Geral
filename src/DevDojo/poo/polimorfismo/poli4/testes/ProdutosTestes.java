package DevDojo.poo.polimorfismo.poli4.testes;

import DevDojo.poo.polimorfismo.poli4.Computador;
import DevDojo.poo.polimorfismo.poli4.Televisao;
import DevDojo.poo.polimorfismo.poli4.Tomate;
import DevDojo.poo.polimorfismo.poli4.servicos.CalcularImposto;

public class ProdutosTestes {

    public static void main(String[] args) {
        Computador computador = new Computador("I12", 15000);

        Tomate tomate = new Tomate("Cipriano", 1.22);
        Televisao televisao = new Televisao("Tv 50º", 2500);

        CalcularImposto.CalculandoImposto(computador);
        System.out.println("====================================");
        tomate.setDataValidade("10/10/24");
        CalcularImposto.CalculandoImposto(tomate);
        System.out.println("=====================================");
        CalcularImposto.CalculandoImposto(televisao);



    }


}
