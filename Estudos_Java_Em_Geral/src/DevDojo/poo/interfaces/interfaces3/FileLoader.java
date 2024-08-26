package DevDojo.poo.interfaces.interfaces3;

public class FileLoader  implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregou arquivos....");
    }

    @Override
    public void remove() {
        System.out.println("Arquivo removido....");
    }
}