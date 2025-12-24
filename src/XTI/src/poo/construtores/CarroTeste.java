package XTI.src.poo.construtores;

public class CarroTeste{

	public static void main(String[] args){
	
		// criando o objeto carro1 usando o construtor padrão
		Carro carro1 = new Carro();
		carro1.modelo = "Mustang";
		carro1.vlocidadeMaxima = 250;
		carro1.segundosZeroACem = 4.5;

		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Velocidade Máxima: " + carro1.vlocidadeMaxima + " km/h");
		System.out.println("0 a 100 km/h em: " + carro1.segundosZeroACem + " segundos");

		
		// criando o objeto carro2 usando o construtor com parâmetros
		// sem o motor associado
		Carro carro2 = new Carro("Camaro", 240, 4.8);
		System.out.println("\n" + carro2);


		
		// posso criar o objeto Motor dentro do construtor do Carro
		// e associá-lo diretamente
		Carro carro3 = new Carro("Challenger", 260, 4.2, new Motor("V8", 485, 6.4));
		System.out.println("\n" + carro3);


		
		//posso criar os 2 objetos separadamente
		// e depois associá-los
		Carro carro4 = new Carro("Challenger", 260, 4.2);
		Motor	motor = new Motor("V8", 485, 6.4);
		carro4.motor = motor;
		
		System.out.println("\n" + carro4);
		
		
		// ou usar os métodos get e set
		// para associar os objetos
		Carro carro5 = new Carro("Challenger", 260, 4.2);
		Motor	motor1 = new Motor("V8", 485, 6.4);
		carro5.setMotor(motor1);
		
		System.out.println("\n" + carro5);
	}


}
