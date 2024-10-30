package DevDojo.lp.arrays;

public class Arrays02 {

    public static void main(String[] args) {

        int[] idade = new int[5];
        idade[0] = 10;
        idade[1] = 25;
        idade[2] = 15;
        idade[3] = 5;
        idade[4] = 55;


        for (int i = 0; i < idade.length; i++) {
            System.out.println("Impressão das posições " + i);
            System.out.println("Impressão dos valores "+idade[i]);
        }



    }
}
