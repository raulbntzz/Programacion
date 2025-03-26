package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Lavadora lavadora = new Lavadora("Samsung", 1199.99, 50);
		lavadora.mostrarDatos();
		
		System.out.println();
		
		Televisor television = new Televisor("Samsung", 2299.99, 80);
		television.mostrarDatos();
	}
}
