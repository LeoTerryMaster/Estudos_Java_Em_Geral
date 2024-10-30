package DevDojo.poo.strings.packed;

public class StringsClass2{


	public static void main(String[] args){
		String nome = " Letícia";
		String numeros = "0123456789";

		System.out.println("Retona a posição da string = " + nome.charAt(3));
		System.out.println("Retorna a quantidade de caractéres = " + nome.length());
		System.out.println("Troca tudo que tiver na primeira posição e substitue   = " + nome.replace(nome, "Leandro"));
		System.out.println("coloca todos em minusculos " + nome.toLowerCase());
		System.out.println("coloca todos em maiúsculo " + nome.toUpperCase());

		System.out.println("Troca o valor da primeira posição peloa da segunda " + nome.replace("L", "LL"));


		System.out.println("substring começa na posição 0 e termina a ultima posição  " + numeros.substring(0, 5));
		System.out.println("retorna da posição para o final " + numeros.substring(5));
		System.out.println("Retorna da posição até o final poré não necessariamente usar lenght" + numeros.substring(0, numeros.length()));


		System.out.println("Remove espaços " + nome.trim());


	}

}
