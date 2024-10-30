package DevDojo.lp.arrays.dimencional;

public class ArraysMultDimencionais6 {

    public static void main(String[] args) {
        int[][] dias = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};


        for (int[] i : dias) {
            System.out.println("\n -------");
            for (int r : i) {
                System.out.print(" " + r);
            }
        }

    }


}
