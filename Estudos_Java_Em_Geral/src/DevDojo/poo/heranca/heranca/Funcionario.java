package DevDojo.poo.heranca.heranca;

public class Funcionario extends Pessoa {
    private double salario;


    static {
        System.out.println("Dentro de Funcionario estático");
     }

    {
        System.out.println("Dentro de Funcionario não  estático");
    }


    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        System.out.println("Dentro do construtor de pessoa");
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("====================================");
        System.out.println("  Funcionário Nome: " + this.nome);
        System.out.println("  Funcionário Cpf: " + getCpf());
        System.out.println("  Funcionário Salário " + this.salario);
        System.out.println("  Funcionário Endereço: " + getEndereco().getRua() + "\n  Cep: " + getEndereco().getCep());
        System.out.println("====================================");

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
