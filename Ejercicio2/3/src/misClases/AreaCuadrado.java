package misClases;

public class AreaCuadrado {
    int lado1 = 5;
    int lado2 = 5;
    
    public void calcularArea() {
	int resultado = (int) lado1 * (int) lado2;
        System.out.println("El área del cuadrado es: " + resultado);
    }
}
