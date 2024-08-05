package DevDojo.lp.estruturascondicioais.exercicio;

public class Taxas {

    public static void main(String[] args) {
        double salarioAnul = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double imposto;

        if (salarioAnul <= 34712) {
            imposto = salarioAnul * primeiraFaixa;
        } else if (salarioAnul >= 34713 && salarioAnul <= 68507) {
            imposto = salarioAnul * segundaFaixa;
        } else {
            imposto = salarioAnul * terceiraFaixa;
        }
        System.out.println(imposto);

    }
}
