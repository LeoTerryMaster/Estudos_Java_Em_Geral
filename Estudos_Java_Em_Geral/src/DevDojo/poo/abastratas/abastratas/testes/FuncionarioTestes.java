package DevDojo.poo.abastratas.abastratas.testes;


import DevDojo.poo.abastratas.abastratas.Gerente;
import DevDojo.poo.abastratas.abastratas.Programador;

public class FuncionarioTestes {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Leandro", 5000);
        Programador programador = new Programador("Leandro", 5000);

        System.out.println(gerente);
        System.out.println(programador);
    }
}
