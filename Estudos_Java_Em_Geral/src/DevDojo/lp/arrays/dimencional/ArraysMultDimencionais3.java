package DevDojo.lp.arrays.dimencional;

public class ArraysMultDimencionais3 {

    public static void main(String[] args) {
        int[][] dias =new int[][] {
                {1, 2, 9}, {10, 55, 99}, {44, 66, 77},{100,22,99}
        };


        for (int[] i : dias) {
            for (int r : i) {
                System.out.println("Leitura de todos " + r);
            }
        }

    }


}
