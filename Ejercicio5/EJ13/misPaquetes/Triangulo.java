package misPaquetes;

public class Triangulo {
	double base;
	double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		double resultado = (base * altura) / 2;
		System.out.println("El resultado es: " + resultado);
	}
}
