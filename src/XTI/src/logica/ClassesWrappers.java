package XTI.src.logica;


public class ClassesWrappers{

	public static void main(String[] args){
			
		Integer numero = 10; // Integer es una clase envoltoria (wrapper) para el tipo primitivo int
		System.out.println("Esse valor de numero es: " + numero);
		
		numero = 30; // Se puede cambiar el valor de un objeto Integer
		System.out.println("Esse valor de numero es: " + numero);
		
		Double decimal = 3.14; // Double es una clase envoltoria para el tipo primitivo double
		System.out.println("Esse valor de decimal es: " + decimal);
		
		Boolean verdadero = true; // Boolean es una clase envoltoria para el tipo primitivo boolean
		System.out.println("Esse valor de verdadero es: " + verdadero);
		
		Character caracter = 'A'; // Character es una clase envoltoria para el tipo primitivo char
		System.out.println("Esse valor de caracter es: " + caracter);
		
		Long largo = 100000L; // Long es una clase envoltoria para el tipo primitivo long
		System.out.println("Esse valor de largo es: " + largo);
		
		Byte byteValue = 127; // Byte es una clase envoltoria para el tipo primitivo byte
		System.out.println("Esse valor de byteValue es: " + byteValue);
		
		Short corto = 30000; // Short es una clase envoltoria para el tipo primitivo short
		System.out.println("Esse valor de corto es: " + corto);
	}
	
}
