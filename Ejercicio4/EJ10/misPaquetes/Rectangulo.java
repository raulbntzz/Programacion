package misPaquetes;

public class Rectangulo extends Figura {
	double base;
	double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		double resultado = base * altura;
		System.out.println("El resultado es: " + resultado);
	}
}
