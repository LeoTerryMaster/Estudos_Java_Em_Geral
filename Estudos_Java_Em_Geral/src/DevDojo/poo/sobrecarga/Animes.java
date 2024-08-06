package DevDojo.poo.sobrecarga;

public class Animes {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;


    public void init(String nome, String tipo, int epsodios) {
        this.init();
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    public void init(String nome, String tipo, int epsodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public void init() {

    }

    public void imprimir() {
        System.out.println("================================");
        System.out.println("  Nome do Anime = " + this.nome);
        System.out.println("  Tipo do Anime  = " + this.tipo);
        System.out.println("  Quantidade de epsódios = " + this.epsodios);
        System.out.println("  Gênero do Anime = " + this.genero);
        System.out.println("================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
}
