package DevDojo.poo.metodos.teste;

import DevDojo.poo.metodos.Calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int r = calculadora.somar(10, 25);
        System.out.println("Resultado com variável "+r);

        System.out.println("Resultado somar "+calculadora.somar(10, 25));
        System.out.println("Resultado multiplicar "+calculadora.multiplicar(10, 25));
        System.out.println("Resultado dividir "+calculadora.dividir(10, 25));
        System.out.println("Resultado dividir "+calculadora.dividir(10, 0));
        System.out.println("Resultado dividir "+calculadora.dividir(0, 1));
        System.out.println("Resultado diminuir "+calculadora.diminuir(25, 15));

         calculadora.calculo();

    }
}
