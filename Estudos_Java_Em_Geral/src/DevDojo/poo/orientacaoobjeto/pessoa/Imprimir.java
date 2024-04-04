package DevDojo.poo.orientacaoobjeto.pessoa;

public class Imprimir{

	public static void impreme(Pessoa estudante){
		System.out.println("=============================================");
		System.out.println("=***   Meu nome é " + estudante.getNome() + "                ***=");
		System.out.println("=***   Minha idade é " + estudante.getIdade() + "                  ***=");
		System.out.println("=***   Meu endereço é " + estudante.getEndereco() + "   ***=");
		if(estudante.getSexo() == 'M'){
			System.out.println("=***   Sexo MASCULINO" + "                    ***=");
		}else{
			System.out.println("=***   Sexo FEMININO" + "                    ***=");
		}
		System.out.println("=============================================");

	}

}
