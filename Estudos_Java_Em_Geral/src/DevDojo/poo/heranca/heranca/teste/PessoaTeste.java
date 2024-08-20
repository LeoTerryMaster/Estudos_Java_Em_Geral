package DevDojo.poo.heranca.heranca.teste;

import DevDojo.poo.heranca.heranca.Endereco;
import DevDojo.poo.heranca.heranca.Funcionario;
import DevDojo.poo.heranca.heranca.Pessoa;

public class PessoaTeste {


    public static void main(String[] args) {



        Pessoa pessoa = new Pessoa("Leandro Gomes","101.293.217-61",new Endereco("Rua Regina","1111"));

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("TerryMaster","111.111.111-61",new Endereco("Rua Regina","111111"),5000);
        funcionario.imprimir();
    }


}
