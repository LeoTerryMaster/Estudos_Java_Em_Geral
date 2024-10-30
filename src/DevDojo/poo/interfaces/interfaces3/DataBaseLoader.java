package DevDojo.poo.interfaces.interfaces3;

public class DataBaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregou banco de datos... ");
    }

    @Override
    public void remove() {
        System.out.println("Removido do banco de dados... ");
    }

    @Override
    public void checkPermissao() {
        System.out.println("Checando no banco de dados... ");
    }
}
