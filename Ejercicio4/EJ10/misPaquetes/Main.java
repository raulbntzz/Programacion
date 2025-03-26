package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(5, 5);
		
		circulo.calcularArea();
		rectangulo.calcularArea();
	}

}
