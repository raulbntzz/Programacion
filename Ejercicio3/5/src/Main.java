import misClases.DiaSemana;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiaSemana resultado = new DiaSemana();

	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce un numero del 1 al 7");
	int numero = scanner.nextInt();
	scanner.close();

        resultado.cualEsDia(numero);
    }
}