package misPaquetes;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa un número porfavor.");
			numeros[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición: " + (i + 1) + " , Número: " + numeros[i]);
		}
		
		scanner.close();
	}
}
