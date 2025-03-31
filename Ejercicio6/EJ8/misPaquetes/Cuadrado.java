package misPaquetes;

public class Cuadrado implements Figura{
	double lado;
	
	public Cuadrado (double lado) {
		this.lado = lado;
	}
	
	public void calcularArea() {
		double resultado = lado * lado;
		System.out.println("El área del cuadrado es: " + resultado);
	}
}
