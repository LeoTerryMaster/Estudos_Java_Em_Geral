package DevDojo.poo.polimorfismo.poli1.servicos;

import DevDojo.poo.polimorfismo.poli1.Computador;
import DevDojo.poo.polimorfismo.poli1.Tomate;

public class CalcularImposto {

    public static void CalculandoImposto(Computador computador) {
        System.out.println("Relatório de imposto do computador... ");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto do computador " + imposto);
    }


    public static void CalculandoImposto(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate... ");
        double imposto = tomate.calcularImposto();
        System.out.println("tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto do tomate " + imposto);
    }
}
