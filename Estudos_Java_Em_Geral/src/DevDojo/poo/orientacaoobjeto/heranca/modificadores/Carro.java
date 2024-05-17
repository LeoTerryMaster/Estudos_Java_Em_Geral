package DevDojo.poo.orientacaoobjeto.heranca.modificadores;


public  class Carro{

	private String nome;
	public static final double VELICIDADE_LIMITE= 250;
	public final Comprador COMPRADOR = new Comprador();

	public final void imprimir(){
		System.out.println(this.nome);
	}
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public Comprador getCOMPRADOR(){
		return COMPRADOR;
	}

}
