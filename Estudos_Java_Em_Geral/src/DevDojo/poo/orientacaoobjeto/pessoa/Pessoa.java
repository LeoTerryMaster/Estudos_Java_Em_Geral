package DevDojo.poo.orientacaoobjeto.pessoa;

public class Pessoa{


	private String nome;
	private int idade;
	private char sexo;
	private String endereco;

	// construtor vazio permite que eu crie o objeto padrão 
	// atraves de seus atributos
	public Pessoa(){

	}

	// mesme método irei criar o objeto de modo simplificado
	public Pessoa(String nome,int idade,char sexo,String endereco){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
	}


	public String getEndereco(){
		return endereco;
	}


	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public char getSexo(){
		return sexo;
	}

	public void setSexo(char sexo){
		this.sexo = sexo;
	}


}
