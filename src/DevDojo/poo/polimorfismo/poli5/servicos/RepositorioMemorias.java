package DevDojo.poo.polimorfismo.poli5.servicos;

import DevDojo.poo.polimorfismo.poli5.repositorio.Repositorio;

public class RepositorioMemorias implements Repositorio {


    @Override
    public void salvar() {
        System.out.println("Salvando na memória ....  ");
    }
}
