package DevDojo.poo.associacao.escola.testes;

import DevDojo.poo.associacao.escola.Escola;
import DevDojo.poo.associacao.escola.Professor;

public class EscolaTeste {

    public static void main(String[] args) {

        Professor professor = new Professor("Leandro Gomes");
        Professor professor2 = new Professor("Letícia Gomes");
        Professor[] professores = {professor,professor2};

        Escola escola = new Escola("Professor Adriano Hipólito", professores);
        escola.imprimir();

    }
}
