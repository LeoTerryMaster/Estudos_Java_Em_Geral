package DevDojo.poo.enumeracao.sobreescrever.enums;

public enum TipoClinete {

    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    },
    PIX{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }
    },
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.3;
        }
    };



    public abstract double calcularDesconto(double valor);
}
