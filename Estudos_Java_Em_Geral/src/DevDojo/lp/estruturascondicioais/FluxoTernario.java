package DevDojo.lp.estruturascondicioais;

public class FluxoTernario {

    public static void main(String[] args) {
        double salario = 6000;
        String msg = "Vou Doar pq tenho condições";
        String semcondicao = "Sem condição, mas um dia terei condições...";

        String resultado = salario > 5000 ? msg : semcondicao;

        System.out.println(resultado);

    }

}
