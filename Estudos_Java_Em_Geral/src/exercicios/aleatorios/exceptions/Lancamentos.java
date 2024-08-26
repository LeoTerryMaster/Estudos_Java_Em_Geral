package exercicios.aleatorios.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lancamentos {


    public static void main(String[] args) {
        File file = new File("src/exercicios/aleatorios/exceptions/arquivo/texto.txt");
        Scanner s = new Scanner(System.in);
        System.out.print("Digite *criar* para criar um arquivo: ");

        String arquivo = s.nextLine();

        if (arquivo.equals("criar")) {
            try {
                boolean cra = file.createNewFile();
                System.out.println("Arquivo criardo " + cra);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (arquivo.equalsIgnoreCase("deletar")) {
            boolean delet = file.delete();
            System.out.println("Arquivo deletado " + delet);
        }


    }


}
