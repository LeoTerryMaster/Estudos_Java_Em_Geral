package DevDojo.poo.interfaces.interfaces2.teste;

import DevDojo.poo.interfaces.interfaces2.DataBaseLoader;
import DevDojo.poo.interfaces.interfaces2.FileLoader;

public class DaraLoaderTestes {



    public static void main(String[] args) {

    DataBaseLoader dataBaseLoader = new DataBaseLoader();
    FileLoader fileLoader = new FileLoader();
    dataBaseLoader.load();
    dataBaseLoader.remove();
    dataBaseLoader.checkPermissao();

    fileLoader.load();
    fileLoader.remove();
    fileLoader.checkPermissao();
    }
}
