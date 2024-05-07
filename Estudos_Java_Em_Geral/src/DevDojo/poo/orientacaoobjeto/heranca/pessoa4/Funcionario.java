package DevDojo.poo.orientacaoobjeto.heranca.pessoa4;

public class Funcionario extends Pessoa{


	static{
		System.out.println("Dentro do bloco estatico funcionario bloco estatico");
	}

	{
		System.out.println("Dentro do bloco estatico funcionario não estatico 1");
	}
	{
		System.out.println("Dentro do bloco estatico funcionario não estatico 2");
	}

	public Funcionario(String nome){
		super(nome);
		System.out.println("Dentro do construtor funcionario");
	}

	private double salario;


	public double getSalario(){
		return salario;
	}


	public void setSalario(double salario){
		this.salario = salario;
	}


	@Override
	public void imprimir(){
		System.out.println("==========================");
		System.out.println(getNome());
		System.out.println(getCpf());
		System.out.println(getEndereco().getRua());
		System.out.println(getEndereco().getCep());
		System.out.println(getSalario());
		System.out.println("==========================");
	}


}
