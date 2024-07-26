package DevDojo.poo.orientacaoobjeto.interfaces;

public class FileDataLoader implements  DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Arquivos carregados..... ");
    }

    @Override
    public void remover() {
        System.out.println("Arquivos removidos...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando arquivos ..");
    }
}
