package misPaquetes;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Double> productos = new HashMap<>();
		productos.put("Pepino", 50.00);
		productos.put("Aguacate", 49.99);
		productos.put("Sandia", 69.69);
		
		productos.forEach((nombre, precio) -> {
			if (precio >= 50.00) {
				System.out.println(nombre + " cuesta: " + precio + "€");
			}    
		});
	}
}
