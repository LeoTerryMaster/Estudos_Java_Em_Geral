package DevDojo.poo.associacao.jogador;

public class Time2 {
    private String nome;
    Jogador2[] jogadores;


    public Time2(String nome) {
        this.nome = nome;
    }

    public Time2(String nome, Jogador2[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public  void imprimi(){
        System.out.println(this.nome);
        if (jogadores== null){
            return;
        }
        for (Jogador2 j2: jogadores){
            System.out.println(j2.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador2[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador2[] jogadores) {
        this.jogadores = jogadores;
    }
}
