package misPaquetes;

public class Perro extends Animal{
	String tamano;	// Se añade el atributo tamaño
	
	public Perro(int numChip, String nombre, int edad, String raza, boolean adoptado, String tamano) {	// Realizamos un constructor para iniciar las variables
		super(numChip, nombre, edad, raza, adoptado);	// Hereda de animal con super
		this.tamano = tamano;
	}
	
	@Override
	public void mostrar() {	// Sobreescribimos el método heredado de Animal para mostrar los detalles del perro
		System.out.println("\nInformación del perro: ");
		System.out.println("- Número De Chip: " + numChip);
		System.out.println("- Nombre: " + nombre);
		System.out.println("- Edad: " + edad);
		System.out.println("- Raza: " + raza);
		System.out.println("- Adoptado: " + adoptado);
	}
}
