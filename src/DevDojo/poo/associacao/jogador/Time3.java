package DevDojo.poo.associacao.jogador;

public class Time3 {
    private String nome;
    Jogador3[] jogadores;


    public Time3(String nome) {
        this.nome = nome;
    }

    public Time3(String nome, Jogador3[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public  void imprimi(){
        System.out.println(this.nome);
        if (jogadores== null){
            return;
        }
        for (Jogador3 j2: jogadores){
            System.out.println(j2.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador3[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador3[] jogadores) {
        this.jogadores = jogadores;
    }
}
