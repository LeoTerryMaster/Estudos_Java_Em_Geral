package DevDojo.poo.orientacaoobjeto.interfaces;

public class DataBaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Database Carregada...");

    }

    @Override
    public void remover() {
        System.out.println("DataBase Removido...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados.....");
    }
}
