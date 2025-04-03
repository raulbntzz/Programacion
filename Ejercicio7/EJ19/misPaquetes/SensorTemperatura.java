package misPaquetes;

public class SensorTemperatura extends Sensor implements Medible{
	public SensorTemperatura(String id, String ubicacion) {
		super(id, ubicacion);
	}
	
	@Override
	public double leerValor() {
		return 69;
	}
	
	@Override
	public String getUnidad() {
		return "ºC";
	}
}
