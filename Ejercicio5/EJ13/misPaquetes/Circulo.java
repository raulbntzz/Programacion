package misPaquetes;

public class Circulo extends Figura{
	public static final double PI = Math.PI;
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea() {
		double resultado = radio * radio * PI;
		System.out.println("El resultado es: " + resultado);
	}
}
