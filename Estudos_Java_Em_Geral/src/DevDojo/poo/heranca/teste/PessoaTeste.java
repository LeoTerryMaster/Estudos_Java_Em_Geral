package DevDojo.poo.heranca.teste;

import DevDojo.poo.heranca.Endereco;
import DevDojo.poo.heranca.Funcionario;
import DevDojo.poo.heranca.Pessoa;

public class PessoaTeste {


    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Regina");
        endereco.setCep("26291-320");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leandro Gomes");
        pessoa.setCpf("101.293.217-61");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("TerryMaster");
        funcionario.setCpf("111.111.111-61");
        funcionario.setSalario(50000);
        funcionario.setEndereco(endereco);
        funcionario.imprimir();
    }


}
