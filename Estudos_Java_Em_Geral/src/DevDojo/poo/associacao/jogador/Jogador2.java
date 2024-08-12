package DevDojo.poo.associacao.jogador;

public class Jogador2 {
    private String nome;
    Time2 time;

    public Jogador2(String nome) {
        this.nome = nome;
    }


    public void imprimir() {
        System.out.println("=================================");
        System.out.println("Nome do jogador é = " + this.nome);
        if (time != null) {
            System.out.println("Nome do time " + time.getNome());
        }

        System.out.println("=================================");
    }

    public void setTime(Time2 time) {
        this.time = time;
    }

    public Time2 getTime() {
        return time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
