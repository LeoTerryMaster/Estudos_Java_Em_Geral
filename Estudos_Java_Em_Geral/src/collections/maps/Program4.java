package collections.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Program4{

	public static void main(String[] args){


		
		// Velocidade rápida porém não respeita ordem nenhuma
		Map<String, String> maps = new ConcurrentHashMap<String, String>();


		maps.put("Nome", "Maria");
		maps.put("Telefone", "21982921391");
		maps.put("Endereço", "Rua Regina");
		maps.put("Profissão", "Programador");


		for (String key : maps.keySet()){
			System.out.println("chave = " + key + " valor = " + maps.get(key));
		}
	}

}
