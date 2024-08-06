package DevDojo.poo.blocoinicializacao;

public class Anime {


    private String nome;
    private int[] epsodios;


    // Bloco de inicialização não estático.
    // Este bloco é executado primeiro que todos os métodos da classe.

    // 1 - Alocado espaço em memória para objeto.
    // 2 - Cada atributo de classe é criado e inicializado  com valores defalut ou o que for passado.
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado.
    {
        System.out.println("Denstro do bloco");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

    }

    public int[] getEpsodios() {
        return epsodios;
    }

    public String getNome() {
        return nome;
    }
}
