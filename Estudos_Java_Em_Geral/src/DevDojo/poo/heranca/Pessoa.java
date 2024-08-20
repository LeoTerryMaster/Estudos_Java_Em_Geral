package DevDojo.poo.heranca;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;


    public void imprimir() {
        System.out.println("====================================");
        System.out.println("  Nome: " + this.nome);
        System.out.println("  Cpf: " + this.cpf);
        System.out.println("  Endereço: " + endereco.getRua() + "\n  Cep: " + endereco.getCep());
        System.out.println("====================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
