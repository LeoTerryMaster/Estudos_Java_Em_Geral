package DevDojo.poo.orientacaoobjeto.seminarios;

import DevDojo.poo.orientacaoobjeto.seminarios.test.Alunos;

public class Seminario {

    private String titulos;

    private Alunos[] alunos;
    private Local local;

    public Seminario(String titulos, Local local) {
        this.titulos = titulos;
        this.local = local;
    }


    public Seminario(String titulos, Alunos[] alunos, Local local) {
        this.titulos = titulos;
        this.alunos = alunos;
        this.local = local;
    }


    public String getTitulos() {
        return titulos;
    }


    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }


    public Alunos[] getAlunos() {
        return alunos;
    }


    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }


    public Local getLocal() {
        return local;
    }


    public void setLocal(Local local) {
        this.local = local;
    }


}
