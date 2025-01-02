package DevDojo.poo.imputoutput.createfiles;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileCreate{


	public static void main(String[] args){


		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\file.txt");
		try{
			boolean iscreate = file.createNewFile();
			if(iscreate == true){
				System.out.println("Arquivo criado ");
			}else{
				System.out.println("Aquivo já existe");
			}

			System.out.println("Retorna o diretório do arquivo " + file.getPath());
			System.out.println("Retorna o caminho absoluto do arquivo " + file.getAbsolutePath());
			System.out.println("Retorna se é diretorio " + file.isDirectory());
			System.out.println("Retorna se é um arquivo  " + file.isFile());
			System.out.println("Retorna se é oucuto  " + file.isHidden());
			System.out.println("Retorna se foi modificado  " + file.lastModified());
			System.out.println("Retorna se foi modificado  " + new Date(file.lastModified()));
			System.out.println("Retorna se foi e lugar  " +   Instant.ofEpochMilli((file.lastModified())).atZone(ZoneId.systemDefault()));
			System.out.println("Retorna se foi modificado  " +   Instant.ofEpochMilli((file.lastModified())).atZone(ZoneId.systemDefault()).toLocalDate());
			System.out.println("Retorna se foi modificado  " +   Instant.ofEpochMilli((file.lastModified())).atZone(ZoneId.systemDefault()).toLocalDateTime());
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
