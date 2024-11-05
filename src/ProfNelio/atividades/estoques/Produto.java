package ProfNelio.atividades.estoques;

public class Produto{

	public String nome;
	public double prince;
	public int quantidade;


	public double TotalInEstoque(){
		return prince * quantidade;
	}

	public void add(int quantidade){
		this.quantidade += quantidade;
	}

	public void remover(int quantidade){
		this.quantidade -= quantidade;
	}


	public void imprimir(){
		System.out.println("\nProduto nome= " + nome + ", \nprince= R$" + prince + ", \nquantidade= " + quantidade+" unidades");

	}

	@Override
	public String toString(){
		return "Produto [nome= " + nome + " Preço R$"+String.format("%.2f",prince) + ", quantidade= " + quantidade + "]" +" Valor total = "+TotalInEstoque();
	}


}
