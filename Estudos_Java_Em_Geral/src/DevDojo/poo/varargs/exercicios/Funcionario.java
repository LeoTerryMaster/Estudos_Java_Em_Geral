package DevDojo.poo.varargs.exercicios;

public class Funcionario {
    String nome;
    int idade;
    double[] salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double[] salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void imprimirSalario() {
        System.out.println("===================================");
        System.out.println("  Nome do funcionário = " + this.nome);
        System.out.println("  Idade do funcionário = " + this.idade);

        if (salario == null){
            return;
        }
        for (double s : salario) {
            System.out.println("  Salário do funcionário = " + s);
        }
        imprimirMediaSalario();
        System.out.println("===================================");
    }

    public void imprimirMediaSalario() {
        if (salario == null){
            return;
        }
        double media = 0;
        for (double s: salario){
            media=+s;
        }
        media /= salario.length;
        System.out.println("  Media salarial "+ media);
    }


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

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
