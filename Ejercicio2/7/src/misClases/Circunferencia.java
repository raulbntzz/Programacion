package misClases;

public class Circunferencia {
    final double PI = 3.1416;
    
    public void calcularCircunferencia(double radio) {
	double resultado = 2 * PI * radio;
	System.out.println(resultado);
    }
}
