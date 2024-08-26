package DevDojo.poo.excecoes.runtimeexception;

public class RunTimeExceptionTeste {

    public static void main(String[] args) {
        divisao(1, 0);
    }


    //ArithmeticException
//    private static int divisao(int a, int b) {
//        if (b == 0) {
//            throw new RuntimeException("Número não pode ser dividido por zero ");
//        }
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Número não pode ser dividido por zero ");
        }
        return a / b;
    }

}
