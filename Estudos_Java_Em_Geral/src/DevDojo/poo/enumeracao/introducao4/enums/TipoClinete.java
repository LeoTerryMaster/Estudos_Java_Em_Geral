package DevDojo.poo.enumeracao.introducao4.enums;

public enum TipoClinete {

    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int numeros;
    private final String nome;

    TipoClinete(int num, String nome) {
        this.numeros = num;
        this.nome = nome;
    }

    public int getNumeros() {
        return numeros;
    }

    public String getNome() {
        return nome;
    }
}
