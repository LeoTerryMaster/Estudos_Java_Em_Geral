package DevDojo.lp.operadores;

public class Aritimeticos4 {

    public static void main(String[] args) {
        // + - * / %

        double x = 25;
        double y = 10;

        double z = x += y;
        System.out.println("Somar " + z);

        z = x -= y;
        System.out.println("subtrair " + z);

        z = x *= y;
        System.out.println("multplicar " + z);

        z = x /= y;
        System.out.println("divisão " + z);

        z = x %= y;
        System.out.println("resto da divisão " + z);

        // operadores unários

        System.out.println(++x); // pré-incremento

        System.out.println(x++); //pós-incremento
        System.out.println(--y); //pré-decremento
        System.out.println(y--);// pós-decremento
    }
}
