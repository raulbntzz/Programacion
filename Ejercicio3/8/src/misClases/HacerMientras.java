package misClases;
import java.util.Scanner;

public class HacerMientras {
    public void sumar() {
	Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
