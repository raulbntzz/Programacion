package misPaquetes;

public class Televisor extends Electrodomesticos {
	double pulgadas;
	
	public Televisor(String marca, double precio, double pulgadas) {
		this.marca = marca;
		this.precio = precio;
		this.pulgadas = pulgadas;
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Marca: " + precio + "€");
		System.out.println("Marca: " + pulgadas + "'");
	}
}
