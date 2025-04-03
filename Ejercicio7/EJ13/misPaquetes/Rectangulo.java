package misPaquetes;

public class Rectangulo extends Figura implements Calculable{
	double alto;
	double ancho;
	
	public Rectangulo(String color, double alto, double ancho) {
		super(color);
		this.alto = alto;
		this.ancho = ancho;
	}
	
	@Override
	public Double calcularArea() {
		return alto * ancho;
	}
}
