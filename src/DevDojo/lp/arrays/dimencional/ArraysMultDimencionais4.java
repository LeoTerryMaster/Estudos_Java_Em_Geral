package DevDojo.lp.arrays.dimencional;

public class ArraysMultDimencionais4 {

    public static void main(String[] args) {
        int[][] dias = new int[3][];

        dias[0] = new int[2];
        dias[1] = new int[3];
        dias[2] = new int[6];


        for (int[] i : dias) {
            System.out.println("\n -------");
            for (int r : i) {
                System.out.print(" " + r);
            }
        }

    }


}
