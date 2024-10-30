package DevDojo.poo.enumeracao.sobreescrever.testes;


import DevDojo.poo.enumeracao.sobreescrever.Cliente;
import DevDojo.poo.enumeracao.sobreescrever.enums.TipoClinete;

public class ClienteTestes {
    public static void main(String[] args) {

        Cliente cliente= new Cliente("Leandro", TipoClinete.DEBITO);
        Cliente cliente1= new Cliente("Leandro", TipoClinete.CREDITO);
        Cliente cliente2= new Cliente("Leandro", TipoClinete.PIX);


        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoClinete.DEBITO.calcularDesconto(10));
        System.out.println(TipoClinete.PIX.calcularDesconto(10));
        System.out.println(TipoClinete.CREDITO.calcularDesconto(10));

    }

}
