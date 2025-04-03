package misPaquetes;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Raúl");
		nombres.add("Daniel");
		nombres.add("Héctor");
		nombres.add("Miguel Ángel");
		
		nombres.forEach((nombre) -> {
		    System.out.println(nombre.toUpperCase());
		});

	}
}
