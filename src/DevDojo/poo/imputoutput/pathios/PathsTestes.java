package DevDojo.poo.imputoutput.pathios;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTestes{

	
	public static void main(String[] args){
		Path pegar = Paths.get("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\diretorio\\pastas");
		Path pegar1 = Paths.get("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS", "Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\diretorio\\pastas");
		Path pegar2 = Paths.get("I:", "GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral", "src\\DevDojo\\poo\\imputoutput\\diretorio\\pastas");
		Path pegar3 = Paths.get("I:", "GITHUB", "PROJETOS_EM_ANDAMENTOS", "Estudos_Java_Em_Geral", "src", "DevDojo", "poo", "imputoutput", "diretorio", "pastas");

		System.out.println(pegar.getFileName());
		System.out.println(pegar1.getFileName());
		System.out.println(pegar2.getFileName());
		System.out.println(pegar3.getFileName());
	}
}
