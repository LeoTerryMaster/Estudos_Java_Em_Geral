package DevDojo.poo.orientacaoobjeto.interfaces.Test;

import DevDojo.poo.orientacaoobjeto.interfaces.DataBaseLoader;
import DevDojo.poo.orientacaoobjeto.interfaces.DataLoader;
import DevDojo.poo.orientacaoobjeto.interfaces.FileDataLoader;

public class DataBaseTest {

    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileDataLoader fileDataLoader = new FileDataLoader();

        fileDataLoader.load();
        fileDataLoader.remover();
        fileDataLoader.checkPermission();


        System.out.println();

        
        dataBaseLoader.load();
        dataBaseLoader.remover();
        dataBaseLoader.checkPermission();
    }
}
