package ProfNelio.poo.produtos;

public class Produto{

	public String nome;
	public double preco;
	public int quantidade;


	public double totalValorEstoque(){
		return preco * quantidade;
	}


	public void addProdutos(int quantidade){
		this.quantidade += quantidade;
	}


	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}


	public void imprimir(){
		System.out.println("Nome: = " + this.nome + "\nPreço = $ " + this.preco + "\nQuantidade = " + this.quantidade);
		System.out.println("Total em estoque = $"+totalValorEstoque());
	}


}
