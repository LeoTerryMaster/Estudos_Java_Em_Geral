package DevDojo.poo.orientacaoobjeto.interfaces;

public interface DataLoader {

    void load();

    default void checkPermission() {
        System.out.println("Checado..");
    }
}
