package misPaquetes;

public class Cuadrado extends Figura{
	double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public void calcularArea() {
		double resultado = lado * lado;
		System.out.println("El resultado es: " + resultado);
	}
}
