package DevDojo.poo.abastratas.abastratas2.testes;


import DevDojo.poo.abastratas.abastratas2.Gerente;
import DevDojo.poo.abastratas.abastratas2.Programador;

public class FuncionarioTestes {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Leandro", 5000);
        Programador programador = new Programador("Leandro", 5000);

        System.out.println(gerente);
        gerente.imprimir();

        System.out.println(programador);
        programador.imprimir();
    }
}
