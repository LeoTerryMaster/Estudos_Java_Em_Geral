package DevDojo.lp.operadores;

public class Relacionais3 {

    public static void main(String[] args) {

        // Operadores Lógicos

        //  && [end/ e], || [se/ or], ! [negação de todas as respostas]

        int idade = 30;
        float salario = 3500F;
        boolean isverdadeira = idade > 30 && salario >= 4612;
        boolean isdentro = idade < 30 && salario >= 3381;

        System.out.println("Dentro da lei maior que 30 " + isverdadeira);
        System.out.println("Dentro da lei menor que 30 " + isdentro);


        double valorTotalCorrente = 200;
        double valorTotalpoupanca = 10000;

        float valorGame = 5000.0F;
        boolean isGame = valorTotalpoupanca > valorGame || valorTotalpoupanca > valorGame;
        System.out.println("É verdadero ou falso que posso comprar o game? " + isGame);


        boolean verdade= true;

        if (!verdade == true){
            System.out.println("Sim é verdadeiro");
        }else {
            System.out.println("Não é negado");
        }

    }
}
