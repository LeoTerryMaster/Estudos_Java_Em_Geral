package DevDojo.poo.polimorfismo.poli5.testes;

import DevDojo.poo.polimorfismo.poli5.repositorio.Repositorio;
import DevDojo.poo.polimorfismo.poli5.servicos.RepositorioArquivos;
import DevDojo.poo.polimorfismo.poli5.servicos.RepositorioBancoDados;

public class RepositorioTestes {

    public static void main(String[] args) {
        Repositorio repositorio= new RepositorioBancoDados();
        repositorio.salvar();


        Repositorio repositorios= new RepositorioArquivos();
        repositorios.salvar();

    }
}
