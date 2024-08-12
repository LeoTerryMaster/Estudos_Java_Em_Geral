package DevDojo.poo.associacao.escola;


public class Escola {
private  String nome;
private Professor[] professores;


    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir(){
        System.out.println("===============================================");
        System.out.println("   Nome da escola "+this.nome);
        if (professores == null){
            return;
        }
        for (Professor professore : professores) {
            System.out.println("   Nome do professor "+professore.getNome());
        }
        System.out.println("===============================================");

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
