package DevDojo.poo.modificadores.primitivos;

public class Carros {
    private String nome;
    public  final Comprador COMPRADOR= new Comprador("Comprador");
    public static final double VELOCIDADE_LIMITE = 250;



    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
