package DevDojo.poo.polimorfismo.poli3.servicos;

import DevDojo.poo.polimorfismo.poli3.Produto;

public class CalcularImposto {

    public static void CalculandoImposto(Produto produto) {
        System.out.println("Relatório de imposto dos Produtos... ");
        double imposto = produto.calcularImposto();
        System.out.println("Produtos " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto dos Produtos " + imposto);
    }


}
