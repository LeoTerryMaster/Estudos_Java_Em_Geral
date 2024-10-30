package collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program3{

	public static void main(String[] args){


		// linledhashMap executa em velocidade intermediária 
		// respeira sua ordem de como foi escrita 
		// Não respeita ordem alfabética e sim a ordem que foi escrito no programa
		Map<String, String> maps = new LinkedHashMap<String, String>();


		maps.put("Nome", "Maria");
		maps.put("Telefone", "21982921391");
		maps.put("Endereço", "Rua Regina");
		maps.put("Profissão", "Programador");


		for (String key : maps.keySet()){
			System.out.println("chave = " + key + " valor = " + maps.get(key));
		}
	}

}
