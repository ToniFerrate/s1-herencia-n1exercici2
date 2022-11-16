package n1Exercici2;
/*
Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al
 constructor de la classe?

Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.
*/
public class N1Exercici2 {

	public static void main(String[] args) {
		
		
		// El Model el podem canviar per tota la classe
		System.out.println(Cotxe.getModel());
		Cotxe.setModel("Cordoba");
		System.out.println(Cotxe.getModel());
		
		
		Cotxe cotxe1 = new Cotxe();
		// Mostra totes less dades un cop inicialitzat el constructor (model)
		System.out.println(Cotxe.getMarca() + " " + Cotxe.getModel() + " " + cotxe1.getPotencia()); 
		
		
		// Exemple d'us de mètode no estàtic.
		cotxe1.accelerar();
		
		// Exemple d'us de mètode estàtic.
		Cotxe.frenar();
	}

}
