package DevDojo.lp.arrays;

public class Arrays04 {

    public static void main(String[] args) {

        int[] idade = {
                10, 25, 15, 5, 55
        };


        for (int i=0; i < idade.length; i++){
            System.out.print(" for < > "+i);
        }

        System.out.println();

        for (int i : idade) {
            System.out.print(", " + i);
        }

    }
}
