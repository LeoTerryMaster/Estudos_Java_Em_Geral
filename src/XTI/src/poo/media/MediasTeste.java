package XTI.src.poo.media;


public class MediasTeste{

	
	public static void main(String[] args){
		Medias med = new Medias();
		
		// passando com inteiros
		System.out.println(" == Média entre 2 números é = "+med.media(10, 20));
		

		// passando com strings 	
		System.out.println(" == Média entre 2 números é = "+med.media("21", "39"));
		
		// passando com varios números
		System.out.println(" == Média entre 2 números é = "+med.media(19,21,99,121,11));
		
	}
}
