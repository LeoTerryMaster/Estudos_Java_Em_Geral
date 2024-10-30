package DevDojo.poo.polimorfismo.poli3.testes;

import DevDojo.poo.polimorfismo.poli3.Computador;
import DevDojo.poo.polimorfismo.poli3.Televisao;
import DevDojo.poo.polimorfismo.poli3.Tomate;
import DevDojo.poo.polimorfismo.poli3.servicos.CalcularImposto;

public class ProdutosTestes {

    public static void main(String[] args) {
        Computador computador = new Computador("I12", 15000);

        Tomate tomate = new Tomate("Cipriano", 1.22);
        Televisao televisao = new Televisao("Tv 50º", 2500);

        tomate.setDataValidade("10/10/24");
        CalcularImposto.CalculandoImposto(computador);
        System.out.println("====================================");
        CalcularImposto.CalculandoImposto(tomate);
        System.out.println("Data de validade " + tomate.getDataValidade());
        System.out.println("=====================================");
        CalcularImposto.CalculandoImposto(televisao);



    }


}
