package DevDojo.poo.interfaces.interfaces3;

public interface DataLoader {

    // modificações na interface
    // privado
    // default
    // protected
    // public

    void load();

    default void checkPermissao(){
        System.out.println("Fazendo checagem de permissão... ");
    }

}
