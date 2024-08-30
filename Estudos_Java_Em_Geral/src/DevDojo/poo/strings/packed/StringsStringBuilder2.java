package DevDojo.poo.strings.packed;

public class StringsStringBuilder2{


	public static void main(String[] args){


		StringBuilder sb = new StringBuilder("Leandro");
		sb.append(" Gomes").append(" dos ").append(" Santos");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(0, 0, null);
	}


}
