package Coder.src.poo.produtos;

public class Produtos{

	String nome;
	int preco;
	int quantidade;


	public Produtos(){

	}

	public Produtos(String nome,int preco,int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getPreco(){
		return preco;
	}

	public void setPreco(int preco){
		this.preco = preco;
	}

	public int getQuantidade(){
		return quantidade;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public String toString(){
		return "Produto: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
	}


}