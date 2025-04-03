package misPaquetes;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Pera");
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Sandía");
		frutas.add("Melón");
		
		Iterator<String> it = frutas.iterator();
		while (it.hasNext()) {
		    String f = it.next();
		    if (f.equals("Pera")) {
		        it.remove();
		    }
		}
		System.out.println(frutas);
	}
}
