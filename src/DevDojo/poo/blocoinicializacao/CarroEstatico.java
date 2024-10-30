package DevDojo.poo.blocoinicializacao;

public class CarroEstatico {

    public static CarroEstatico _instancia;


    /*
    para instaciar uma classse é preciso ter um construtor
    e assim criar a instância
    * */
    public CarroEstatico() {

    }

    public static CarroEstatico getInstance() {
        if (_instancia == null) {
            _instancia = new CarroEstatico();
        }
        return _instancia;
    }

    private String nome;
    private double velocidadMaxima;
    private static double getVelocidadLimite;


    // Bloco de inicialização  estático.
    // Este bloco é executado primeiro que todos os métodos da classe.

    // 1 - Alocado espaço em memória para objeto.
    // 2 - Cada atributo de classe é criado e inicializado  com valores defalut ou o que for passado.
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado.

    static {
        getVelocidadLimite = 250;
    }


    public CarroEstatico(String nome, double velocidadMaxima) {
        this.nome = nome;
        this.velocidadMaxima = velocidadMaxima;

    }

    public void imprimir() {
        System.out.println("=============================================");
        System.out.println("Nome = " + this.nome);
        System.out.println("Velocidade Máxima = " + this.velocidadMaxima);
        System.out.println("Velocidade Limite = " + CarroEstatico.getVelocidadLimite);
        System.out.println("=============================================");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public static double getVelocidadLimite() {
        return CarroEstatico.getVelocidadLimite;
    }

    public static void setVelocidadLimite(double getVelocidadLimite) {
        CarroEstatico.getVelocidadLimite = getVelocidadLimite;
    }
}
