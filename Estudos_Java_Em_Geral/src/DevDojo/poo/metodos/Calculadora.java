package DevDojo.poo.metodos;

public class Calculadora {

    public int somar(int x, int y) {
        return x + y;
    }

    public int multiplicar(int x, int y) {
        return x * y;
    }

    public int dividir(int x, int y) {
        if (y != 0){
            return x/y;
        }
        return 0;
    }

    public int diminuir(int x, int y) {
        return x- y;
    }

    public void calculo(){
        System.out.println("Cálculo método void "+ (10+25));
    }

}
