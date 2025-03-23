package misClases;

public class Operaciones {
    int num1 = 12;
    int num2 = 6;
    int resultado = 0;

    public void suma() {
	int resultado = (int) num1 + (int) num2;
	System.out.println("El resultado es: " + resultado);
    }

    public void resta() {
	int resultado = (int) num1 - (int) num2; 
	System.out.println("El resultado es: " + resultado);
    }

    public void multiplicacion() {
	int resultado = (int) num1 * (int) num2; 
	System.out.println("El resultado es: " + resultado);
    }

    public void division() {
	int resultado = (int) num1 / (int) num2;
	System.out.println("El resultado es: " + resultado);
    }
}
