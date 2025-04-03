package misPaquetes;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> personas = new HashMap<>();
		
		personas.put("Raúl", 18);
		personas.put("DaniG", 19);
		
		System.out.println("Introduce el nombre de la persona.");
		String nombre = scanner.next();
		System.out.println("La edad de " + nombre + " es: " + personas.get(nombre) + " años");
		
		scanner.close();
	}
}
