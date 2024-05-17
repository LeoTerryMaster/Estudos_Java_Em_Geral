package DevDojo.poo.orientacaoobjeto.heranca.pessoa2;

public class Funcionario extends Pessoa{

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
