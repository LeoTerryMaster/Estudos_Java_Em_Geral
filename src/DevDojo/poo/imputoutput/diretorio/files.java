package DevDojo.poo.imputoutput.diretorio;

import java.io.File;
import java.io.IOException;

public class files{


	public static void main(String[] args) throws IOException{

		File filediretorio = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\diretorio\\pastas");
		boolean isDiretorio = filediretorio.mkdir();
		System.out.println(isDiretorio);

		File fileCriando = new File(filediretorio, "arquivo.txt");
		boolean isCriado = fileCriando.createNewFile();
		System.out.println("Criando arquivos " + isCriado);


		File filerenomeie = new File(filediretorio, "Leandro_Programador.txt");
		boolean isRenomeie = fileCriando.renameTo(filerenomeie);
		System.out.println("Trocando nome do arquivo " + isRenomeie);


		File diretorioRenomear = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\diretorio\\pasta2");
		boolean isReomearDiretorio = filediretorio.renameTo(diretorioRenomear);
		System.out.println("Trocar nome da pasta " + isReomearDiretorio);

	}

}
