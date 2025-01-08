package DevDojo.poo.imputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTestes2{

	public static void main(String[] args) throws IOException{

		Path pastaPath = Paths.get("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\pathsio\\pasta");

		if(Files.notExists(pastaPath)){
			Path pastaDiterorio = Files.createDirectory(pastaPath);
		}
		Path subPasta = Paths.get("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\pathsio\\pasta");
		Path subDiretorio = Files.createDirectories(subPasta);
		System.out.println(subDiretorio);
		
		Path filesPegarDiretorio= Paths.get(subPasta, "files.txt");
		if(Files.notExists(filesPegarDiretorio)){
			Path pastaDiterorio = Files.createDirectory(filesPegarDiretorio);
		}
		
	}

}
