package n1Exercici2;
/*
Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model 
estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al
 constructor de la classe?

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat 
accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() 
ha de mostrar: “El vehicle està frenant”. 
*/
public class Cotxe {
	static final String marca = "Seat"; // Inmutable i context general de classe. S'ha d'inicialitzar al moment de declarar-la perquè és final (constant)
	static String model = ""; // No inmutable i context general de classe. No cal inicialitzar-la al declarar-la
	final String potencia = "150 CV"; // Inmutable i context d'instància. S'ha d'inicialitzar al moment de declarar-la perquè és final (constant)
	
	
	// Model pot inicialitzar-se en un bloc d'inicialització estàtic.
	static {
		model = "Ibiza";
	}
	
	// Model pot inicialitzar-se en el constructor de la classe
	public Cotxe() {
		model = "Toledo";
	}
	
	// Model pot inicialitzar-se en un setter estàtic
	public static void setModel(String model) {
		Cotxe.model = model;
	}

	

	
	
	// Getters

	public static String getModel() {
		return model;
	}

	public static String getMarca() {
		return marca;
	}

	public String getPotencia() {
		return potencia;
	}


	
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	
	
}
