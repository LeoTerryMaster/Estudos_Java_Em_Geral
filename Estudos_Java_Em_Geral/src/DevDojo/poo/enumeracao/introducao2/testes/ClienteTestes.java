package DevDojo.poo.enumeracao.introducao2.testes;


import DevDojo.poo.enumeracao.introducao2.Cliente;
import DevDojo.poo.enumeracao.introducao2.Cliente.TipoClinete;


public class ClienteTestes {
    public static void main(String[] args) {

        Cliente cliente= new Cliente("Leandro", TipoClinete.DEBITO);
        Cliente cliente1= new Cliente("Leandro", TipoClinete.DEBITO);
        Cliente cliente2= new Cliente("Leandro", TipoClinete.PIX);


        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);

    }

}
