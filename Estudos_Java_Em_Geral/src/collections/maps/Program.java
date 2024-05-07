package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Program{

	public static void main(String[] args){


		
		// HashMap é o mais rápido de todos porém ler o programa aleatorio
		// não tem ordenação na sua execução.
		Map<String, String> maps = new HashMap<String, String>();


		maps.put("Nome", "Maria");
		maps.put("Telefone", "21982921391");
		maps.put("Endereço", "Rua Regina");
		maps.put("Profissão", "Programador");


		for (String key : maps.keySet()){
			System.out.println("chave = " + key + " valor = " + maps.get(key));
		}
	}

}
