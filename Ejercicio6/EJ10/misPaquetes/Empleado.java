package misPaquetes;

public class Empleado implements Identificable{
	String nombre = "Raúl";
	int edad = 18;
	
	public void mostrarIdentidad() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
}
