package misPaquetes;

public class Persona {
	String nombrePersona;
	int edadPersona;
	
	public void setNombre(String nombre) {
		nombrePersona = nombre;
	}
	
	public String getNombre() {
		return nombrePersona;
	}
	
	public void setEdad(int edad) {
		edadPersona = edad;
	}
	
	public int getEdad() {
		return edadPersona;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("Edad: " + edadPersona);
	}
}
