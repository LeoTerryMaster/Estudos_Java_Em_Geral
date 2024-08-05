package DevDojo.poo.varargs;

public class Calcular {


    public void Somar(String nome, int... numeros) {
        int soma = 0;

        for (int n : numeros) {
            soma += n;
        }
        System.out.println(nome + soma);
    }

    public void somarArrays(String nome,int[] numeros){
        int soma = 0;

        for (int n : numeros) {
            soma += n;
        }
        System.out.println(nome + soma);
    }

}
