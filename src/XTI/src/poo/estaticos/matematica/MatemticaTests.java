package XTI.src.poo.estaticos.matematica;

public class MatemticaTests{


	public static void main(String[] args){

		Matemtica mat = new Matemtica();

		int maior = mat.maior(10, 20);
		System.out.println("o número maior entre 2 é = " + maior);


		double soma = mat.somar(20, 1000);
		System.out.println("A soma entre 2 númenros é = " + soma);


		int maiores = (int) mat.somar(mat.maior(10, 20), mat.maior(10, 20));
		System.out.println("o número maior entre 2 é = " + maiores);


		double d0 = mat.somar(10, 1000);
		System.out.println(d0);


		// Somar vários números usando varargs
		double d22 = mat.somar2(10, 1000, 50, 25, 5);
		System.out.println("Referencias de var args " + d22);


		
		double[] valores = {10, 1000, 50, 25, 5};
		// Somar vários números usando varargs
		double d23 = mat.somar3(valores);
		System.out.println("Referencias de var args + arrays " + d23);
		// Tenho 2 possobilidade de criar um sistema 

		/*
		 * temos o tratamento de erros com try catch
		 * tratamento depois que o erro aconteceu.
		 * */
		try{
			double resultado = mat.dividir2(10, 0);
			System.out.println("Resultado: " + resultado);
		}catch(IllegalArgumentException e){
			// Aqui você captura o erro e decide o que mostrar
			System.out.println("Erro: " + e.getMessage());
		}


		/*
		 * Temos também comparação para executar o valor
		 * tratamento com  comparaçao para evitar erros
		 * */
		double divisor = 0;
		if(divisor != 0){
			mat.dividir2(10, 0);
		}else{
			System.out.println("Atenção: não é porssivel dividir por zero!!");
		}


		// tratamento com Optional para APIs modernas 
		mat.dividir(10, 0).ifPresentOrElse(res -> System.err.println("resultado" + res), () -> System.err.println("Erro: Não houve resultado (divisão por zero)"));


		// tratamento com assert
		double d3 = mat.dividir3(10, 0);
		System.out.println(d3);


		// erro  com auditoria de logg
		double d4 = mat.dividir4(10, 0);
		System.out.println(d4);


		double raiz = mat.raiz(100);
		System.err.println("Raiz quadrada é = " + raiz);


		double raizManual = mat.raizManual(100);
		System.err.println("Raiz Manual quadrada é = " + raizManual);

		double raizManual2 = mat.raizManual(27);
		System.err.println("Raiz Manual quadrada é = " + raizManual2);
	}


	/*
	 * Técnica,Quando usar?,Vantagem
	* Try-Catch,Erros inesperados ou externos (ex: ler um arquivo).,Separa a lógica do erro.
	* If/Else,Validações simples e lógicas conhecidas.,Mais rápido e fácil de ler.
	* Optional,API modernas e fluxos funcionais.,Evita o famoso NullPointerException.
	* Log,Sistemas que rodarão em servidores.,Permite auditoria do que deu errado depois.
	 * */

	//1- try- cathc  Trata o erro depois que ele "explode"
	//2- If/else Evita que o erro aconteça (Prevenção).
	//3- Optional: Trata a ausência de valor como algo normal do fluxo.
	//4- Log: Documenta o erro para análise futura
}
