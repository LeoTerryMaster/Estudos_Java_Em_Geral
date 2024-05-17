package DevDojo.poo.orientacaoobjeto.heranca.modificadores;


public class Carro2{

	private String nome;
	public static final double VELICIDADE_LIMITE;

// o bloco sempre irá ser inicializado primeiro
static 	{
		VELICIDADE_LIMITE = 250;

	}
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}
