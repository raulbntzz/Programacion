package misClases;

public class CalculadoraSimple {
    int num1 = 5;
    int num2 = 5;
    int resultado = 0;
    
    public void suma() {
	int resultado = (int) num1 + (int) num2;
        System.out.println("El total de la suma es: " + resultado);
    }

    public void resta() {
	int resultado = (int) num1 - (int) num2;
        System.out.println("El total de la resta es: " + resultado);
    }

    public void multiplicacion() {
	int resultado = (int) num1 * (int) num2;
        System.out.println("El total de la multiplicación es: " + resultado);
    }

    public void division() {
	int resultado = (int) num1 / (int) num2;
        System.out.println("El total de la división es: " + resultado);
    }
}
