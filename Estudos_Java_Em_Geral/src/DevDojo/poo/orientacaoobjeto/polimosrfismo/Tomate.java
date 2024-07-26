package DevDojo.poo.orientacaoobjeto.polimosrfismo;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do Tomate.... ");
        return this.valor * IMPOSTO;
    }
}
