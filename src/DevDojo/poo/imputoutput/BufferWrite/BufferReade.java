package DevDojo.poo.imputoutput.BufferWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReade{


	public static void main(String[] args){

		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\file.txt");

		try(FileReader ler = new FileReader(file)){

			BufferedReader br = new BufferedReader(ler);


			String linha;

			while((linha = br.readLine()) != null){

				System.out.println(linha);
			}


		}catch(Exception e){

			e.printStackTrace();
		}


	}

}
