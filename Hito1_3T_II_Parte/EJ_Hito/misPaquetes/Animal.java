package misPaquetes;

public abstract class Animal {
	int numChip;	// Se establecen los atributos
	String nombre;
	int edad;
	String raza;
	boolean adoptado;
	
	public Animal (int numChip, String nombre, int edad, String raza, boolean adoptado) {	// Realizamos un constructor para iniciar las variables
		this.numChip = numChip;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.adoptado = adoptado;
	}
	
	abstract void mostrar();	// Creamos un método abstracto mostrar
}
