package curso_free.anotacao;

import java.io.Serializable;

/*
 * Instiruição : Leandro TerryMaster Projeto : aulas Data da criação: 04/012/2024 criador : Leandro
 */

@Cabecalho(instituicao = "MultVerso", pojeto = "Aulas", dataCriação = " 04/12/2023", criador = " TerryMaster", revisao = 2)

@ErrosCorrigidos(erros = {
	"0001",
	"0002"})
@SuppressWarnings("Serial")
public class Anotacao implements Serializable{

	@Deprecated
	public void anotar(){
	}

	@Override
	public String toString(){
		return null;
	}

}
