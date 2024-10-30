package DevDojo.lp.operadores;

public class Relacionais {

    public static void main(String[] args) {
        int idade = 61;

        if (idade >= 1 && idade <= 6) {
            System.out.println("Bebê de colo");
        }else if (idade >= 7 && idade <= 12) {
            System.out.println("Criança");
        }else  if (idade >= 12 && idade <= 17) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60 && idade <= 80) {
            System.out.println("Idoso");
        }

    }
}
