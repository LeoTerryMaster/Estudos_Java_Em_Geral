package DevDojo.lp.estruturascondicioais;

public class fluxoCondicional {

    public static void main(String[] args) {

        String atravessarARua = "vem Carro";

        if (atravessarARua.equalsIgnoreCase("vem Carro")) {
            System.out.println("Não atraversar");
        } else {
            System.out.println("Pode atravessar ");
        }

        // operador de negação
        if (!atravessarARua.equalsIgnoreCase("vem Carro")) {
            System.out.println("Não atraversar");
        } else {
            System.out.println("Pode atravessar ");
        }
    }

}
