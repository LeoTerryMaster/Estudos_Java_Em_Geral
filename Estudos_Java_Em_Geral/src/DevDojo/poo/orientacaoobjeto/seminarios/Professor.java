package DevDojo.poo.orientacaoobjeto.seminarios;

import DevDojo.poo.orientacaoobjeto.seminarios.test.Alunos;

public class Professor{


	private String nome;
	private String especialidade;

	private Seminario[] seminario;

	public Professor(String nome,String especialidade){
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor(String nome,String especialidade,Seminario[] seminario){
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminario = seminario;
	}


	public void imprimir(){
		System.out.println("==================================");
		System.out.println("   Professor " + this.nome);
		System.out.println("   ## Seminários cadastrados ##");
		if(this.seminario == null){
			return;
		}
		for (Seminario seminario : this.seminario){
			System.out.println("   " + seminario.getTitulos());
			System.out.println("   " + seminario.getLocal().getEndereco());
			if(seminario.getAlunos() == null){
				continue;
			}
			System.out.println("   **** Alunos ****");
			for (Alunos aluno : seminario.getAlunos()){
				System.out.println("   Aluno " + aluno.getNome());
				System.out.println("   idade " + aluno.getIndade());
			}
		}
		System.out.println("==================================");
	}


	public String getNome(){
		return nome;
	}


	public void setNome(String nome){
		this.nome = nome;
	}


	public String getEspecialidade(){
		return especialidade;
	}


	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}


	public Seminario[] getSeminario(){
		return seminario;
	}


	public void setSeminario(Seminario[] seminariosDisponiveis){
		this.seminario = seminariosDisponiveis;
	}


}
