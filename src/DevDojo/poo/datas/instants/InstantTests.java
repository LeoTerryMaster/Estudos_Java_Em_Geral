package DevDojo.poo.datas.instants;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTests{

	
	
	public static void main(String[] args){
		
		Instant now = Instant.now();
		
		System.out.println(now);
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		System.out.println(Instant.ofEpochSecond(3));

		
		System.out.println();
		
		System.out.println(LocalDateTime.now());
		
		
	}
}
