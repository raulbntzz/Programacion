package misPaquetes;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] nombres = new String[3];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingresa un nombre porfavor.");
			nombres[i] = scanner.next();
		}
		
		for (int i = nombres.length - 1; i >= 0 ; i--) {
			System.out.println("Posición: " + i + ", Nombre: " + nombres[i]);
		}
		
		scanner.close();
	}
}
