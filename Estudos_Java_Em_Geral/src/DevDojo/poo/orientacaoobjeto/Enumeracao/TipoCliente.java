package DevDojo.poo.orientacaoobjeto.Enumeracao;


public enum TipoCliente{
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSAO_JURIDICA(2,"Pessoa Jurídica");

	private final  int VALOR;
	private String nomeRelatorio;
	TipoCliente(int valor, String nomeRelatorio) {
	this.VALOR= valor;
	this.nomeRelatorio= nomeRelatorio;
}
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
		for (TipoCliente tipoCliente : values()) {
		if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio));
			return tipoCliente;
		}
		return null;
	}

	public int getValor() {
		return VALOR;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}
}
