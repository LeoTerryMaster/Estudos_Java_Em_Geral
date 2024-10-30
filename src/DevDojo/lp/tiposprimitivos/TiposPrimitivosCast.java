package DevDojo.lp.tiposprimitivos;

public class TiposPrimitivosCast {


    public static void main(String[] args) {

        // tipos primitivos inteiros
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;

        // tipos primitivos flutuantes
        float f = 100.0F;
        double d = 100.0D;

        // tipos primitos de comparação
        boolean bb = true;

        // tipo primitovos de caracteres
        char cc = 'A';


        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("boolean" + bb);
        System.out.println("char " + cc);

        i = s; // cast implícito

        System.out.println(i);

        i=(int)l;// cast explícito

        System.out.println(i);
    }
}
