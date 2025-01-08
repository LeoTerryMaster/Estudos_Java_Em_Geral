package DevDojo.poo.imputoutput.BufferWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever{


	public static void main(String[] args){

		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\src\\DevDojo\\poo\\imputoutput\\createfiles\\File.txt");

		try(FileWriter fw = new FileWriter(file)){

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("          Eu Leandro vou ser o melhor programador do mundo!!!          Come�ando pelo Brasil serei o melhor na programação");
			bw.newLine();
			bw.flush();

		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
