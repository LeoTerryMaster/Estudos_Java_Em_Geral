package DevDojo.poo.interfaces.interfaces2;

public interface DataLoader {

    void load();

    default void checkPermissao(){
        System.out.println("Fazendo checagem de permissão... ");
    }

}
