package DevDojo.lp.estruturascondicioais;

public class FluxoBreack {


    public static void main(String[] args) {

        int count = 50;

        for (int i = 0; i <= count; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);

        }
    }
}
