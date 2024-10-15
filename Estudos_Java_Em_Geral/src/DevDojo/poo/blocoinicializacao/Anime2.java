package DevDojo.poo.blocoinicializacao;

public class Anime2 {


    private String nome;
    private static int[] epsodios;


    // Bloco de inicialização não estático.
    // Este bloco é executado primeiro que todos os métodos da classe.

    // 0 - Bloco de inicialização é carregado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para objeto.
    // 2 - Cada atributo de classe é criado e inicializado  com valores defalut ou o que for passado.
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado.
   static  {
        System.out.println("Denstro do bloco estático  1");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    // Carrega conforme são escritos
    static  {
        System.out.println("Denstro do bloco estático 2");

    }
    // Carrega conforme são escritos
    static  {
        System.out.println("Denstro do bloco estático 3");

    }

    public Anime2(String nome) {
        this.nome = nome;
    }

    public Anime2() {
        for (int ep : Anime2.getEpsodios()) {
            System.out.print(ep + " ");
        }
        System.out.println();

    }

    public static int[] getEpsodios() {
        return epsodios;
    }

    public String getNome() {
        return nome;
    }
}
