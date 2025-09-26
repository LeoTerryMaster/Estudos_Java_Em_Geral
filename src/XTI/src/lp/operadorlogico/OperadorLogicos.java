package XTI.src.lp.operadorlogico;

public class OperadorLogicos{


	public static void main(String[] args){

		int x = 60;


		System.out.println((x >= 1) && (x <= 10));
		System.out.println((x >= 1) || (x <= 10));


		String y = (x >= 50) ? "sim " : "não";

		System.out.println(y);

	}

}
