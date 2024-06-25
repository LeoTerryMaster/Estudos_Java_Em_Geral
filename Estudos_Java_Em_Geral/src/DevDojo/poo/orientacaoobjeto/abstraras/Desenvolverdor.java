package DevDojo.poo.orientacaoobjeto.abstraras;

public class Desenvolverdor extends Funcionario {
    public Desenvolverdor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolverdor{" +
                "nome= '" + nome + '\'' +
                ", salario= " + salario +
                '}';
    }
}
