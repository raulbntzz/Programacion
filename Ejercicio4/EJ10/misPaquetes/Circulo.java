package misPaquetes;

public class Circulo extends Figura{
	public static final double PI = Math.PI;
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void calcularArea() {
		double resultado = PI * radio * radio;
		System.out.println("El resultado es: " + resultado);
	}
}
