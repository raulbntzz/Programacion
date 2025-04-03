package misPaquetes;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		ArrayList<Sensor> sensores = new ArrayList<>();
		HashMap<String, Double> ultimaLectura = new HashMap<>();
		
		sensores.add(new SensorTemperatura("1", "Valdemoro"));
		sensores.add(new SensorTemperatura("2", "Pinto"));
		sensores.add(new SensorHumedad("1", "Valdemoro"));
		sensores.add(new SensorHumedad("2", "Pinto"));

		for (Sensor sensor : sensores) {
			double valor = ((Medible)sensor).leerValor();
			System.out.println("Sensor " + sensor.id + " ubicado en " + sensor.ubicacion + ", hay " + valor + ((Medible)sensor).getUnidad());
			ultimaLectura.put(sensor.id, valor);
		}
		System.out.println(ultimaLectura);
	}
}
