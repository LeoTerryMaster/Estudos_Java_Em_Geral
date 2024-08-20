package DevDojo.poo.enumeracao.sobreescrever;


import DevDojo.poo.enumeracao.sobreescrever.enums.TipoClinete;

public class Cliente {

    private String nome;
    private TipoClinete tipoClinete;

    public Cliente(String nome, TipoClinete tipoClinete) {
        this.nome = nome;
        this.tipoClinete = tipoClinete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoClinete getTipoClinete() {
        return tipoClinete;
    }

    public void setTipoClinete(TipoClinete tipoClinete) {
        this.tipoClinete = tipoClinete;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoClinete=" + tipoClinete +
                '}';
    }
}
