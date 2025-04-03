package misPaquetes;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(8);
		numeros.add(3);
		numeros.add(5);
		
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);
	}
}
