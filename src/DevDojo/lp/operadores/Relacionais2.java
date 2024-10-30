package DevDojo.lp.operadores;

public class Relacionais2 {

    public static void main(String[] args) {


        boolean isverdadeiro = 10 > 20;
        boolean isverdadeiro1 = 10 < 20;
        boolean isverdadeiro2 = 10 == 20;
        boolean isverdadeiro3 = 10 != 20;

        System.out.println("Maior que " + isverdadeiro);
        System.out.println("menor que " + isverdadeiro1);
        System.out.println("É igual ? " + isverdadeiro2);
        System.out.println("É diferente " + isverdadeiro3);

        // Operadores Lógicos

        //  && [end/ e], || [se/ or], ! [negação de todas as respostas]

        int idade = 30;
        float salario = 3500F;
        boolean isverdadeira = idade > 30 && salario >= 4612;
        boolean isdentro = idade < 30 && salario >= 3381;

        System.out.println("Dentro da lei maior que 30 " + isverdadeira);
        System.out.println("Dentro da lei menor que 30 " + isdentro);

    }
}
