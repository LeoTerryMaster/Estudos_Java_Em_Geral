package DevDojo.poo.enumeracao.introducao.testes;


import DevDojo.poo.enumeracao.introducao.Cliente;
import DevDojo.poo.enumeracao.introducao.enums.TipoClinete;

public class ClienteTestes {
    public static void main(String[] args) {

        Cliente cliente= new Cliente("Leandro", TipoClinete.PESSOA_FISICA);
        Cliente cliente1= new Cliente("Leandro", TipoClinete.PESSOA_JURIDICA);


        System.out.println(cliente);
        System.out.println(cliente1);

    }

}
