package DevDojo.lp.estruturascondicioais;

public class FluxoTernario2 {

    public static void main(String[] args) {
        int idade = 12;

        String resultado = idade > 1 && idade <= 6 ? "Bebe de colo" : idade >= 7 && idade <= 11 ? "Temos uma criaça " : idade >= 12 && idade <= 18 ? "Temos um adolescente " : "temos um Adulto";

        System.out.println(resultado);

    }

}
