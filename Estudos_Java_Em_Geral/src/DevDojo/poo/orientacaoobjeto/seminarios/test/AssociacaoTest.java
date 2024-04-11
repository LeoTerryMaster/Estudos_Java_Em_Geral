package DevDojo.poo.orientacaoobjeto.seminarios.test;

import DevDojo.poo.orientacaoobjeto.seminarios.Local;
import DevDojo.poo.orientacaoobjeto.seminarios.Professor;
import DevDojo.poo.orientacaoobjeto.seminarios.Seminario;

public class AssociacaoTest{


	public static void main(String[] args){
		Local local = new Local("Rua Regina Nº 300");
		Alunos alunos = new Alunos("Leandro Gomes", 40);
		Professor professor = new Professor("TerryMaster", "Programador");
		Alunos[] alunos2ParaSeminarios = {
			alunos};

		Seminario seminario = new Seminario("Coliseu", alunos2ParaSeminarios, local);
		Seminario[] seminariosDisponiveis= {seminario};
		professor.setSeminario(seminariosDisponiveis);
		
		
		professor.imprimir();

	}

}
