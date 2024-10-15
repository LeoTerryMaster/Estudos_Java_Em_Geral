package DevDojo.poo.associacao.jogador;

public class Time {
    private String nome;
    Jogador jogador;


    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
