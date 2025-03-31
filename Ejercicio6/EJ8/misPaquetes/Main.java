package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado(2);
		Triangulo triangulo1 = new Triangulo(5, 2);
		
		cuadrado1.calcularArea();
		triangulo1.calcularArea();
	}
}
