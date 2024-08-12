package DevDojo.poo.associacao.jogador;

public class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }


    public void imprimir() {
        System.out.println("=================================");
        System.out.println("Nome do jogador é = " + this.nome);
        System.out.println("=================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
