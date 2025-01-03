package DevDojo.poo.imputoutput.ler;

import java.io.File;
import java.io.FileReader;

public class LerFile{


	public static void main(String[] args){

		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\file.txt");

		try(FileReader ler = new FileReader(file)){

//			System.out.println(ler.read());
			
			int i;
			while((i=ler.read()) != -1){
				System.out.print((char)i);
			}
			
			
		}catch(Exception e){

			e.printStackTrace();
		}


	}

}
