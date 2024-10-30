package DevDojo.poo.excecoes.runtimeexception2;

public class RunTimeExceptionTeste2 {

    public static void main(String[] args) {


        extracted();
    }

    private static String extracted() {
        try {
            System.out.println("Abrindo Aquivos");
            System.out.println("Escrevendo no aquivo");
            return "Abrindo conexão";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recusrso ");
        }
        return null;
    }


    /*
    Outras possibilidades 
    * */

//    private static String extracted2() {
//        try {
//            System.out.println("Abrindo Aquivos");
//            System.out.println("Escrevendo no aquivo");
//            return "Abrindo conexão";
//        } finally {
//            System.out.println("Fechando recusrso ");
//        }
//    }
}
