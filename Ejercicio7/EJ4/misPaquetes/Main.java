package misPaquetes;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> tareas = new ArrayList<>();
		tareas.add("Limpiar Baño");
		tareas.add("Limpiar Cocina");
		tareas.add("Limpiar Salón");
		tareas.add("Limpiar Habitación");
		
		System.out.println(tareas);
		tareas.remove(0);
		System.out.println(tareas);
	}

}
