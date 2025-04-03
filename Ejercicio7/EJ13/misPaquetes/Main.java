package misPaquetes;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo("Rojo", 5));
		figuras.add(new Circulo("Verde", 10));
		figuras.add(new Rectangulo("Amarillo", 4, 6));
		figuras.add(new Rectangulo("Azul", 8, 10));
		
		double suma = 0;
		for (Figura figura : figuras) {
			suma += ((Calculable) figura).calcularArea();
		}
		System.out.println("El resultado de sumar las áreas es: " + suma);
	}
}
