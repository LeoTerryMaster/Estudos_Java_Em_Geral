package DevDojo.poo.regex.scanner;


import java.util.Scanner;

public class ScannerTestes1 {


    public static void main(String[] args) {

    String texto = "Levi,Eren,Mikasa,true,200";

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter( ",");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }


    }
    }

