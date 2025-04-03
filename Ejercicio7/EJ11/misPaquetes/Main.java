package misPaquetes;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Movible> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche("AAA"));
		vehiculos.add(new Coche("BBB"));
		vehiculos.add(new Bicicleta("CCC"));
		vehiculos.add(new Bicicleta("DDD"));
		
		for (Movible vehiculo : vehiculos) {
			vehiculo.mover();
		}
	}
}
