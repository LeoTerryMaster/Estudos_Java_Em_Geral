package XTI.src.logica.operadores;


public class DivisaoTratada {
    
    // Método para divisão de inteiros
    public static String dividirInt(int a, int b) {
        if (b == 0) {
            return "Erro: divisão por zero não é permitida (int)";
        }
        int resultado = a / b;
        return "Resultado (int): " + resultado;
    }

    // Método para divisão de double
    public static String dividirDouble(double a, double b) {
        double resultado = a / b;

        if (Double.isNaN(resultado)) {
            return "Erro: resultado é NaN (0.0 / 0.0)";
        } else if (Double.isInfinite(resultado)) {
            return "Aviso: resultado é infinito (divisão por zero)";
        }
        return "Resultado (double): " + resultado;
    }

    public static void main(String[] args) {
        System.out.println(dividirInt(10, 2));      // ok
        System.out.println(dividirInt(10, 0));      // erro
        System.out.println(dividirDouble(10.0, 0)); // infinito
        System.out.println(dividirDouble(0.0, 0.0));// NaN
    }
}
