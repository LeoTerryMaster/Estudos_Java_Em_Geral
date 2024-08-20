package DevDojo.poo.enumeracao.buscaratributo.testes;


import DevDojo.poo.enumeracao.buscaratributo.Cliente;
import DevDojo.poo.enumeracao.buscaratributo.enums.TipoClinete;

public class ClienteTestes {
    public static void main(String[] args) {

        Cliente cliente= new Cliente("Leandro", TipoClinete.PESSOA_FISICA);
        Cliente cliente1= new Cliente("Leandro", TipoClinete.PESSOA_JURIDICA);


        System.out.println(cliente);
        System.out.println(cliente1);

        System.out.println(TipoClinete.TipoClineteNome("Pessoa Física"));
        System.out.println(TipoClinete.TipoClineteNome("Pessoa Físicas"));

    }

}
