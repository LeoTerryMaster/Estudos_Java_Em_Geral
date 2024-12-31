package DevDojo.poo.regex.scanner;

public class ScannerTestes {


    public static void main(String[] args) {

    String texto = "Levi, Eren, Mikasa";
    String[] nomes = texto.split("\\d");

   for(String nome : nomes){
        System.out.println(nome.trim());
    }
    }
}
