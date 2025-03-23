package misClases;

public class Comparador {
    public void comparar(int a, int b) {
	if (a > b) {
		System.out.println("El numero " + a + " es mayor que " + b);
	} else if (a < b) {
		System.out.println("El numero " + b + " es mayor que " + a);
	} else {
		System.out.println("El numero " + a + " es igual que " + b);	
	}
    }
}
