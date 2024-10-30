package DevDojo.lp.arrays.dimencional;

public class ArraysMultDimencionais {

    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;


        dias[1][0] = 11;
        dias[1][1] = 15;
        dias[1][2] = 25;


        dias[2][0] = 5;
        dias[2][1] = 9;
        dias[2][2] = 111;


        for (int i = 0; i < dias.length; i++) {
            int r = dias[0][i];
            System.out.println(" Pegar na posição 0 " + r);
        }

        System.out.println();

        for (int i = 0; i < dias.length; i++) {
            int r = dias[1][i];
            System.out.println(" Pegar na posição 1 " + r);
        }
        System.out.println();

        for (int i = 0; i < dias.length; i++) {
            int r = dias[2][i];
            System.out.println(" Pegar na posição 2 " + r);
        }
    }


}
