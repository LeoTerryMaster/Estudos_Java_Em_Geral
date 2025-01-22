package ProfNelio.exercicios.coverter.primeiro;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da taxa de conversão
        System.out.print("Informe a taxa de câmbio atual (1 USD em BRL): ");
        double taxaCambio = scanner.nextDouble();

        // Solicitar o valor em Reais
        System.out.print("Informe o valor em Reais (BRL) a ser convertido: ");
        double valorReais = scanner.nextDouble();

        // Realizar a conversão
        double valorDolares = valorReais / taxaCambio;

        // Exibir o resultado
        System.out.printf("O valor em Dólares (USD) é: %.2f%n", valorDolares);

        // Fechar o scanner
        scanner.close();
    }
}
