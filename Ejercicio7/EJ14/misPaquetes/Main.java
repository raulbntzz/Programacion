package misPaquetes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Empleado> empleado = new HashMap<>();
		empleado.put(1, new EmpleadoPorHoras(1, "Raúl", 5, 30));
		empleado.put(2, new EmpleadoPorHoras(2, "Daniel", 6, 20));
		empleado.put(3, new EmpleadoFijo(3, "Héctor", 2000));
		empleado.put(4, new EmpleadoFijo(4, "Miguel Ángel", 3000));
		
		Iterator<Map.Entry<Integer, Empleado>> it = empleado.entrySet().iterator();
		while (it.hasNext()) {
            Map.Entry<Integer, Empleado> entry = it.next();
            System.out.println("El empleado " + entry.getKey() + " cobra " + ((Pagable) entry.getValue()).calcularSalarioMensual() + " euros");
        }
	}
}
