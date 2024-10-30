package DevDojo.poo.excecoes.exceptions;

public class StackOverFlow {

    public static void main(String[] args) {
        recusividade();
    }

    public  static  void recusividade(){
        recusividade();
    }
}
