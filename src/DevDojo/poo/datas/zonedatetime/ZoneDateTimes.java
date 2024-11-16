package DevDojo.poo.datas.zonedatetime;

import java.time.ZoneId;
import java.util.Map;

public class ZoneDateTimes{


	public static void main(String[] args){
		Map<String, String> zonaIDs = ZoneId.SHORT_IDS;

		System.out.println(zonaIDs);

		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyo);
		
		
		

	}

}
