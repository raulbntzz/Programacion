package misClases;

public class OperacionesBasicas {
    public static void sumar(int a, int b) {
	int resultado = (int) a + (int) b;
	System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void restar(int a, int b) {
	int resultado = (int) a - (int) b;
	System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicar(int a, int b) {
	int resultado = (int) a * (int) b;
	System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void dividir(int a, int b) {
	int resultado = (int) a / (int) b;
	System.out.println("El resultado de la división es: " + resultado);
    }
}
