package DevDojo.lp.estruturascondicioais;

public class FluxoRepeticaoFor {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; --i) {
            System.out.println("Contagem regressiva " + i);
        }


        for (int j = 0; j <= 10; j++) {
            System.out.println("Contagem normal " + j);
        }


        int l= 0;
        for(; l<=10;l++){
            System.out.println("For normal com variável separado "+l);
        }

    }

}
