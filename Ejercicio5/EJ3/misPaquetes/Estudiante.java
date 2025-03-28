package misPaquetes;

public class Estudiante extends Persona{
	String curso;
	
	public Estudiante(String nombrePersona, int edadPersona, String curso) {
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.curso = curso;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("Edad: " + edadPersona);
		System.out.println("Curso: " + curso);
	}
}
