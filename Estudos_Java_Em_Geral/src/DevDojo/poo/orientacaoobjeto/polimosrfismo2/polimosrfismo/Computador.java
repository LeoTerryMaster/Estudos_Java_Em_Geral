package DevDojo.poo.orientacaoobjeto.polimosrfismo2.polimosrfismo;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do Computador.... ");
        return this.valor * IMPOSTO;
    }
}
