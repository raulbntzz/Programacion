package misPaquetes;

public class Gato extends Animal{
	boolean testLeucemia;	// Se añade el atributo leucemia
	
	public Gato(int numChip, String nombre, int edad, String raza, boolean adoptado, boolean testLeucemia) {	// Realizamos un constructor para iniciar las variables
		super(numChip, nombre, edad, raza, adoptado);	// Hereda de animal con super
		this.testLeucemia = testLeucemia;
	}
	
	@Override
	public void mostrar() {	// Sobreescribimos el método heredado de Animal para mostrar los detalles del gato
		System.out.println("\nInformación del gato: ");
		System.out.println("- Número De Chip: " + numChip);
		System.out.println("- Nombre: " + nombre);
		System.out.println("- Edad: " + edad);
		System.out.println("- Raza: " + raza);
		System.out.println("- Adoptado: " + adoptado);
	}
}
