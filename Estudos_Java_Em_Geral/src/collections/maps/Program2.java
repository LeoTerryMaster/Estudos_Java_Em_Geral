package collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class Program2{

	public static void main(String[] args){


		// treemap é mais lento entre todos os maps 
		// sua vantagem é que ler em escala de árvore 
		// Obedecendo em ordem alfabética
		Map<String, String> maps = new TreeMap<String, String>();


		maps.put("Nome", "Maria");
		maps.put("Telefone", "21982921391");
		maps.put("Endereço", "Rua Regina");
		maps.put("Profissão", "Programador");


		for (String key : maps.keySet()){
			System.out.println("chave = " + key + " valor = " + maps.get(key));
		}
	}

}
