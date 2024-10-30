package DevDojo.poo.varargs.teste;

import DevDojo.poo.varargs.Calcular;

public class CalcularTeste1 {

    public static void main(String... args) {

        Calcular cal = new Calcular();
        cal.Somar("VarArgs Sem variável ",10, 15, 60, 80, 19, 100);

        int[] num = {10, 15, 60, 80, 19, 100};
        cal.Somar("VarArgs Com variável ",num);


        cal.somarArrays("Arrays com variável ",num);
    }
}
