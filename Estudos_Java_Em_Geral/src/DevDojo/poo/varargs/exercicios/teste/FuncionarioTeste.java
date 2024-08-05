package DevDojo.poo.varargs.exercicios.teste;

import DevDojo.poo.varargs.exercicios.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario f= new Funcionario("Leandro",40,new double[]{1200,2500,3500});
        f.imprimirSalario();



        System.out.println();


        Funcionario f2= new Funcionario();
        f2.setNome("Fernanda");
        f2.setIdade(40);
        f2.setSalario(new double[]{1222,2000,3500,5000});
        f2.imprimirSalario();



    }
}
