package misPaquetes;

public class Coche extends Vehiculo {
	int puertas;
	
	public Coche(String marca, String modelo, int puertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
	}
	
	public void mostrarDatos() {
		System.out.println("La marca del vehículo es: " + marca);
		System.out.println("El modelo del vehículo es: " + modelo);
		System.out.println("El vehículo cuenta con: " + puertas + " puertas");
	}
}
