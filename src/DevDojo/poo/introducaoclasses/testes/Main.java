package DevDojo.poo.introducaoclasses.testes;

import DevDojo.poo.introducaoclasses.Estudante;
import DevDojo.poo.introducaoclasses.ImprimirEstudante;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Leandro";
        estudante.idade = 40;
        estudante.sexo = 'M';
        ImprimirEstudante.immprimir(estudante);



    }
}
