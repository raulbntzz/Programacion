package misPaquetes;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		HashSet<String> colores = new HashSet<>();
		colores.add("Rojo");
		colores.add("Amarillo");
		colores.add("Rojo");
		
		System.out.println(colores);
	}
}
