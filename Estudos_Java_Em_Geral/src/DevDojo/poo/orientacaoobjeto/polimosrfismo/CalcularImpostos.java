package DevDojo.poo.orientacaoobjeto.polimosrfismo;

public class CalcularImpostos {
    public static void calcularImpostosComputador(Computador computador) {
        System.out.println("Relatório de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do compuador " + computador.getNome());
        System.out.println("Imposto do compuador " + computador.getValor());
        System.out.println("Imposto do compuador " + imposto);
    }


    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do Computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do compuador " + tomate.getNome());
        System.out.println("Imposto do compuador " + tomate.getValor());
        System.out.println("Imposto do compuador " + imposto);
    }
}
