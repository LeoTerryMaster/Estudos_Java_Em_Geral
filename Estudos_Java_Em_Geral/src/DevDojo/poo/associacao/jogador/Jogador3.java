package DevDojo.poo.associacao.jogador;

public class Jogador3 {
    private String nome;
    Time3 time;

    public Jogador3(String nome) {
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

    public void setTime(Time3 time) {
        this.time = time;
    }

    public Time3 getTime() {
        return time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
