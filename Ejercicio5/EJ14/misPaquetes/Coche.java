package misPaquetes;

public class Coche extends Vehiculo{
	int numPuertas;
	
	public Coche(String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas = numPuertas;
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}
}
