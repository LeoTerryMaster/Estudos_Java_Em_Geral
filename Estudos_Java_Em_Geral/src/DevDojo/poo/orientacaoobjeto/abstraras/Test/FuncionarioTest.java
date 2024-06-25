package DevDojo.poo.orientacaoobjeto.abstraras.Test;

import DevDojo.poo.orientacaoobjeto.abstraras.Desenvolverdor;
import DevDojo.poo.orientacaoobjeto.abstraras.Funcionario;
import DevDojo.poo.orientacaoobjeto.abstraras.Gerente;

public class FuncionarioTest {


    public static void main(String[] args) {
        Gerente gerente = new Gerente("Leandro Gomes", 5000);
        System.out.println(gerente);

        Desenvolverdor desenvolverdor= new Desenvolverdor("Leandro Gomes", 10000 );
        System.out.println(desenvolverdor);

        gerente.imprimir();
        desenvolverdor.imprimir();
    }


}
