package DevDojo.poo.orientacaoobjeto.heranca.pessoa.test;

import DevDojo.poo.orientacaoobjeto.heranca.pessoa.Endereco;
import DevDojo.poo.orientacaoobjeto.heranca.pessoa.Funcionario;
import DevDojo.poo.orientacaoobjeto.heranca.pessoa.Pessoa;

public class Pessoa1{


	public static void main(String[] args){

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Regina");
		endereco.setCep("26-291-320");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leandro Gomes");
		pessoa.setCpf("101.293.217-61");
		pessoa.setEndereco(endereco);
		pessoa.imprimir();
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Funcionário: Leandro Gomes");
		funcionario.setCpf("101.293.217-61");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(5000);
		funcionario.imprimir();

	}

}
