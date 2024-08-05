package DevDojo.poo.modificadoracesso.testes;

import DevDojo.poo.modificadoracesso.ModificardorAcesso;

public class ModificardorAcessoTestes {


    public static void main(String... args) {
        ModificardorAcesso m = new ModificardorAcesso();
        m.nome ="Leandro";
        m.setIdade(40);
        m.setSalario(5000);
        m.setPagamento(2500);

        System.out.println(m.getNome());
        System.out.println(m.getIdade());
        System.out.println(m.getSalario());
        System.out.println(m.getPagamento());
    }

}
