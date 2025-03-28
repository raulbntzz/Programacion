package misPaquetes;

public class Estudiante extends Persona{
	String curso;
	
	public Estudiante(String nombrePersona, int edadPersona, String curso) {
		super(nombrePersona, edadPersona);
		this.curso = curso;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("Edad: " + edadPersona);
		System.out.println("Curso: " + curso);
	}
}
