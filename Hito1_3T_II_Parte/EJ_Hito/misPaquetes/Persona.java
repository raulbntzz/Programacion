package misPaquetes;

public class Persona {
	String nombre;	// Se establecen los atributos
	String apellidos;
	String dni;
	String direccion;
	String telefono;
	String correo;
	
	public Persona (String nombre, String apellidos, String dni, String direccion, String telefono, String correo) {	// Realizamos un constructor para iniciar las variables
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}
}
