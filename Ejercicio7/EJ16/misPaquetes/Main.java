package misPaquetes;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Item>> categorias = new HashMap<>();
		categorias.put("Libros", new ArrayList<>());
        categorias.put("Electrónicos", new ArrayList<>());
        
        categorias.get("Libros").add(new Libro(1, "El Quijote"));
        categorias.get("Libros").add(new Libro(2, "1984"));
        categorias.get("Electrónicos").add(new Electronico(1, "Samsung"));
        categorias.get("Electrónicos").add(new Electronico(2, "Apple"));
        
        for (Map.Entry<String, ArrayList<Item>> categoria : categorias.entrySet()) {
        	System.out.println("\nCategoría: " + categoria.getKey());
        	for (Item objeto : categoria.getValue()) {
        		System.out.println("- " + ((Describible)objeto).describir());
        	}	
        }
	}
}
