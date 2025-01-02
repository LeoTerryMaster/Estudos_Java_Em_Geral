package DevDojo.poo.imputoutput.createfiles;

import java.io.File;
import java.io.IOException;

public class FileDelete{


	public static void main(String[] args) throws IOException{


		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\file.txt");

		boolean exist = file.exists();

		if(exist){
			file.delete();
			System.out.println("Deletado");
		}else {
			System.out.println("Arquvi não existe");
		}

	}

}
