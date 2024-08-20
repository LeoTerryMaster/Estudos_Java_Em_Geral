package DevDojo.poo.enumeracao.buscaratributo.enums;

public enum TipoClinete {

    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int numeros;
    private final String nome;

    TipoClinete(int num, String nome) {
        this.numeros = num;
        this.nome = nome;
    }

    public static TipoClinete TipoClineteNome(String nomes){
        for (TipoClinete tipos: values()){
            if (tipos.getNome().equals(nomes)){
                return tipos;
            }
        }
        return null;
    }


    public int getNumeros() {
        return numeros;
    }

    public String getNome() {
        return nome;
    }
}
