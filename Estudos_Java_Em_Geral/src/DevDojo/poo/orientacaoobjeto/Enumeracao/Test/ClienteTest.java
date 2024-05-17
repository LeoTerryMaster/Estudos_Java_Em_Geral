package DevDojo.poo.orientacaoobjeto.Enumeracao.Test;


import DevDojo.poo.orientacaoobjeto.Enumeracao.Cliente;
import DevDojo.poo.orientacaoobjeto.Enumeracao.TipoCliente;
import DevDojo.poo.orientacaoobjeto.Enumeracao.TipoPagamento;

public class ClienteTest{

	public static void main(String[] args){
		Cliente cliente1 = new Cliente("Leandro", TipoCliente.PESSAO_JURIDICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Leandro",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

		System.out.println(cliente1);
		System.out.println(cliente2);

		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

//		TipoCliente tipoCliente= TipoCliente.valueOf("PESSOA_FISICA");
//		System.out.println(tipoCliente.getNomeRelatorio());
		TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
		System.out.println(tipoCliente2);



	}

}
