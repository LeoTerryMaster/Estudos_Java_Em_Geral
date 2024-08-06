package DevDojo.poo.construtores;

public class AnimesConstrutor {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String studio;


    public AnimesConstrutor(String nome, String tipo, int epsodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public AnimesConstrutor(String nome, String tipo, int epsodios, String genero, String studio) {
        this(nome, tipo, epsodios, genero);
        this.studio = studio;
    }

    public void imprimir() {
        System.out.println("================================");
        System.out.println("  Nome do Anime = " + this.nome);
        System.out.println("  Tipo do Anime  = " + this.tipo);
        System.out.println("  Quantidade de epsódios = " + this.epsodios);
        System.out.println("  Gênero do Anime = " + this.genero);
        System.out.println("  Feito no sudio = " + this.studio);
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
