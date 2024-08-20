package DevDojo.poo.polimorfismo.poli1;

import DevDojo.poo.polimorfismo.poli1.interfaces.Taxavel;

public abstract class Produto implements Taxavel {
    protected  String nome;
    protected   double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
