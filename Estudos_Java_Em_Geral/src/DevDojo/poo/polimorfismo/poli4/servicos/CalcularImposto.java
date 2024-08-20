package DevDojo.poo.polimorfismo.poli4.servicos;

import DevDojo.poo.polimorfismo.poli4.Produto;
import DevDojo.poo.polimorfismo.poli4.Tomate;

public class CalcularImposto {

    public static void CalculandoImposto(Produto produto) {
        System.out.println("Relatório de imposto dos Produtos... ");
        double imposto = produto.calcularImposto();
        System.out.println("Produtos " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto dos Produtos " + imposto);
        if (produto instanceof Tomate) {
        Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade" + tomate.getDataValidade());
        }


    }


}
