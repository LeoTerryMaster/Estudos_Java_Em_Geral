package DevDojo.poo.imputoutput.escreverfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverFilesRescreva{

	// File
	// FileWrite
	// FileReader
	// BufferesWriter
	// BufferesReader

	public static void main(String[] args){

		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\File.txt");

		try(FileWriter fw = new FileWriter(file)){

			boolean isExiste = file.exists();
			if(isExiste){
				fw.write("          Eu Leandro vou ser o melhor programador do mundo!!! \n           Come�ando pelo Brasil serei o melhor na progração");
				fw.flush();
			}else{
				System.out.println("não existe arquivo para ser escrito");
			}


		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
