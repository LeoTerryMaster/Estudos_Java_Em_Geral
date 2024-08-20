package DevDojo.poo.enumeracao.introducao3.enums;

public enum TipoClinete {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int numeros;

    TipoClinete(int num) {
    this.numeros=num;
    }

    public int getNumeros() {
        return numeros;
    }
}
