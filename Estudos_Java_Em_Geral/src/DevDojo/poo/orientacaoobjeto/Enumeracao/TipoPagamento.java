package DevDojo.poo.orientacaoobjeto.Enumeracao;

public enum TipoPagamento{
		DEBITO(1,"Débito"){
			@Override
			public double calcularDesconto(double valor) {
				return valor *0.1;
			}
		},
		CREDITO(2,"Crédito"){
			@Override
			public double calcularDesconto(double valor) {
				return valor *0.05;
			}
		};

		private int valor;
		private  String nome;
		TipoPagamento(int valor, String nome) {
		this.valor=valor;
		this.nome=nome;
		}

		public abstract double calcularDesconto(double valor);


		public int getValor() {
			return valor;
		}

		public String getNome() {
			return nome;
		}
	}