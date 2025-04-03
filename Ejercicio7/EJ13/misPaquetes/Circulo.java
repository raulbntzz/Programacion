package misPaquetes;

public class Circulo extends Figura implements Calculable{
	double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public Double calcularArea() {
		return radio * radio * Math.PI;
	}
}
