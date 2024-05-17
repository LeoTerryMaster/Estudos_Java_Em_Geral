package DevDojo.poo.orientacaoobjeto.heranca.pessoa3.test;

import DevDojo.poo.orientacaoobjeto.heranca.pessoa3.Endereco;
import DevDojo.poo.orientacaoobjeto.heranca.pessoa3.Funcionario;
import DevDojo.poo.orientacaoobjeto.heranca.pessoa3.Pessoa;

public class Pessoa1{


	public static void main(String[] args){

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Regina");
		endereco.setCep("26-291-320");

		Pessoa pessoa = new Pessoa("Leandro Gomes");
		pessoa.setCpf("101.293.217-61");
		pessoa.setEndereco(endereco);
		pessoa.imprimir();


		Funcionario funcionario = new Funcionario("Funcionário: Leandro Gomes");
		funcionario.setCpf("101.293.217-61");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(5000);
		funcionario.imprimir();
		funcionario.relatoriopagamento();
	}

}
