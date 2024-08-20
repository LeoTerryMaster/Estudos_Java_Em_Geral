package DevDojo.poo.interfaces.interfaces1.teste;

import DevDojo.poo.interfaces.interfaces1.DataBaseLoader;
import DevDojo.poo.interfaces.interfaces1.FileLoader;

public class DaraLoaderTestes {



    public static void main(String[] args) {

    DataBaseLoader dataBaseLoader = new DataBaseLoader();
    FileLoader fileLoader = new FileLoader();
    dataBaseLoader.load();
    fileLoader.load();
    }
}
