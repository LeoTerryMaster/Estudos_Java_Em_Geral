package DevDojo.poo.modificadoracesso;

public class ModificardorAcesso {

    //public é um modificador que todas as classes tem acesso, seja dento ou fora do pacote

    //private é um modificador que só a mesma classe tem acesso e que pode ser acessado ou modificados seus atributos
    //atraves de getts && setts.

    // protected é um modificar que só os filhos da super classe podem acessar seus atributos

    // Sem o nome do modificador é também um tipo de modificador que só quem esta dentro do mesmo pacote pode assessar
    // os atributos das classes.

    public  String nome;
    private  int idade;
    protected double salario;
    float pagamento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getPagamento() {
        return pagamento;
    }

    public void setPagamento(float pagamento) {
        this.pagamento = pagamento;
    }
}
