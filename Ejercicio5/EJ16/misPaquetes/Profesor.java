package misPaquetes;

public class Profesor extends Persona{
	String asignatura;
	
	public Profesor(String nombrePersona, int edadPersona, String asignatura) {
		this.asignatura = asignatura;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("Edad: " + edadPersona);
		System.out.println("Asignatura: " + asignatura);
	}
}
