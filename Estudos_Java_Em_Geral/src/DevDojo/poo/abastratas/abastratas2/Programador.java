package DevDojo.poo.abastratas.abastratas2;

public class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario+ salario * 0.8;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
