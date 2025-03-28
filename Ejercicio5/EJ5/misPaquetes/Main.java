package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Raúl", 18);
		persona.mostrarDatos();
		
		System.out.println();
		
		Estudiante estudiante = new Estudiante("Raúl", 18, "Primero DAW");
		estudiante.mostrarDatos();
	}
}
