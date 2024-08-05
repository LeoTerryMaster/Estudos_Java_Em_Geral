package DevDojo.lp.estruturascondicioais;

public class FluxoSwitch {

    public static void main(String[] args) {

        // só o que pode ser usado no switch
        // char, int, byte, short, enum, String


        byte dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Escolhido dia errado");
        }


    }
}
