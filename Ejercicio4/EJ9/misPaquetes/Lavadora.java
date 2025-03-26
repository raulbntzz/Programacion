package misPaquetes;

public class Lavadora extends Electrodomesticos{
	double capacidadKg;
	
	public Lavadora(String marca, double precio, double capacidadKg) {
		this.marca = marca;
		this.precio = precio;
		this.capacidadKg = capacidadKg;
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Precio: " + precio + "€");
		System.out.println("Capacidad: " + capacidadKg + "kg");
	}
}
