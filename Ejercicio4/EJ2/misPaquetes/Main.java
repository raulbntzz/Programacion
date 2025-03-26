package misPaquetes;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Raúl");
		Persona persona3 = new Persona("Raúl", 18);
		
		persona1.mostrarInfo();
		System.out.println();
		persona2.mostrarInfo();
		System.out.println();
		persona3.mostrarInfo();
	}

}
