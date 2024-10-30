package DevDojo.poo.polimorfismo.poli5.servicos;

import DevDojo.poo.polimorfismo.poli5.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivos ....  ");
    }
}
