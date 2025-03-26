package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Raúl", 5000, "Informática");
		empleado1.mostrarDatos();
		System.out.println();
		
		Empleado empleado2 = new Empleado("Daniel", 5, "Esclavo");
		empleado2.mostrarDatos();
	}
}
