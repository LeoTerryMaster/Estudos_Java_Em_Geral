package DevDojo.lp.estruturascondicioais;

public class FluxoRepeticaoWhileDoWhile {

    public static void main(String[] args) {

        // while, do while, for

        int conut = 0;

        while (conut <= 10) {
            System.out.println("While normal "+conut);
            ++conut;
        }

        int conut1 = 0;

        do {
            System.out.println("do While "+conut1);
            conut1++;
        }while (conut1<= 10);



    }

}
