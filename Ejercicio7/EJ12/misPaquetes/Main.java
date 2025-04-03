package misPaquetes;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(new Perro("Toby"));
		animales.add(new Perro("Dani"));
		animales.add(new Gato("Michi"));
		animales.add(new Gato("Misifu"));
		
		for (Animal animal : animales) {
			if (animal instanceof Comunicable) {
				System.out.println(animal.nombre + " dice " + ((Comunicable) animal).hacerSonido());
			}
		}
	}
}
