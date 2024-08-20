package DevDojo.poo.associacao.leitira;

import java.util.Scanner;

public class LeituraDasos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome:Leandro ");

        String nome = s.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();


        System.out.println("================================");
        System.out.println("Nome é: " + nome);
        System.out.println("Idade e: " + idade);
        System.out.println("================================");
    }
}
