package DevDojo.poo.excecoes.exceptions2;

import java.io.File;
import java.io.IOException;

public class ExceptionTestes {


    public static void main(String[] args) {

//        CriarNovoAquivo();
        DeletarArquivo();
    }


    private static void CriarNovoAquivo() {
        File file = new File("src/DevDojo/poo/excecoes/exceptions2/files/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void DeletarArquivo() {
        File file = new File("src/DevDojo/poo/excecoes/exceptions2/files/teste.txt");
        boolean deletar = file.delete();
        System.out.println("Arquivo deletado " + deletar);
    }
}
