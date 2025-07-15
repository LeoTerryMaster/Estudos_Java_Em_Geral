package Coder.src.poo.produtos;

public class ProdutosTestes{


	public static void main(String[] args){
		Produtos p1 = new Produtos("Arroz", 20, 5);
		System.out.println(p1);


		System.out.println("Nome = " + p1.getNome());
		System.out.println("Preço = " + p1.getPreco());
		System.out.println("Quantidade = " + p1.getQuantidade());

		Produtos p2 = new Produtos();

		p2.setNome("Feijão");
		p2.setPreco(15);
		p2.setQuantidade(10);
		System.out.println(p2);

		Produtos p3 = new Produtos();
		p3.nome = "Feijão";
		p3.preco = 15;
		p3.quantidade = 10;


		System.out.println(p3);

		System.out.println("Nome = " + p3.getNome());
		System.out.println("Preço = " + p3.getPreco());
		System.out.println("Quantidade = " + p3.getQuantidade());
		
		System.out.printf( "Nome: %s, Preço: R$%d, Quantidade: %d%n", p3.getNome(), p3.getPreco(), p3.getQuantidade());
		System.out.printf("%s, %d, %d", p3.getNome(), p3.getPreco(), p3.getQuantidade());

	}

}
