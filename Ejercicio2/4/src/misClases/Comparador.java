package misClases;

public class Comparador {
    int a = 5;
    int b = 6;
    
    public void compararNumeros() {
	if (a > b) {
		System.out.println("El numero a es mayor que el numero b");
	}

	else if (a < b) {
		System.out.println("El numero b es mayor que el numero a");
	}

	else {
		System.out.println("El numero a es igual que el numero b");
	}
    }
}
