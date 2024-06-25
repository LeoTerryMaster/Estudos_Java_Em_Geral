package DevDojo.poo.orientacaoobjeto.heranca.pessoa3;

public class Pessoa{

	protected String nome;
	protected String cpf;
	protected Endereco endereco;


	public Pessoa(String nome){
		this.nome = nome;
	}

	public Pessoa(String nome,String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public void imprimir(){

		System.out.println("==========================");
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.endereco.getRua());
		System.out.println(this.endereco.getCep());
		System.out.println("==========================");

	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}


	public Endereco getEndereco(){
		return endereco;
	}


	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}


}
