package misPaquetes;

public class SensorHumedad extends Sensor implements Medible{
	public SensorHumedad(String id, String ubicacion) {
		super(id, ubicacion);
	}
	
	@Override
	public double leerValor() {
		return 5;
	}
	
	@Override
	public String getUnidad() {
		return "%";
	}
}
