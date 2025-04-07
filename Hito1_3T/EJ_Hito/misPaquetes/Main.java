package misPaquetes;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Creamos una instancia del scanner
		ArrayList<Animal> animales = new ArrayList<>();	// Creamos un ArrayList para almacenar los datos de los animales
		int opcion = 0;
		
		while (opcion != 4) {	// Mientras que la opción sea otra que 4 (Salir), muestre el menú al igual que sus opciones
			System.out.println("\n--- Elige una opción ---");	// Muestra el menú de opciones
			System.out.println("1. Añadir Perro");
			System.out.println("2. Añadir Gato");
			System.out.println("3. Ver Animales");
			System.out.println("4. Salir");
			opcion = scanner.nextInt();	// Obtiene el valor introducido por el usuario
			
			switch (opcion) {	// Filtra el número introducido por el usuario para elegir la opción
				case 1:
					System.out.println("\nIntroduce el numero del chip del perro: ");
					int PerroNumChip = scanner.nextInt();	// Recoge el valor del chip introducido por el usuario
					boolean PerroExistente = false;	// Se declara la variable para decir si existe o no el animal
					
					for (Animal animal : animales) {	// Se utiliza un for para recorrer el ArrayList de animales
				        if (animal.numChip == PerroNumChip) {	// Con un if, comprobamos si existe ya el chip introducido
				        	System.out.println("El número del chip introducido ya existe, porfavor, introduzca un chip correcto.");
				        	PerroExistente = true;	// Establece que el animal si existe
				        	break;
				        } else {
				        	PerroExistente = false;	// Establece que el animal no existe
				        	continue;
				        }
					}
					
					if (PerroExistente == false) {	// Si la variable es falsa (no existe el animal), pide los datos al usuario
					    System.out.println("\nIntroduce el nombre del perro: ");
						String PerroNombre = scanner.next();
						
						System.out.println("\nIntroduce la edad del perro: ");
						int PerroEdad = scanner.nextInt();
						
						System.out.println("\nIntroduce la raza del perro: ");
						String PerroRaza = scanner.next();
						
						System.out.println("\nIntroduce si el perro es adoptado (true o false): ");
						boolean PerroAdoptado = scanner.nextBoolean();
						
						System.out.println("\nIntroduce el tamaño del perro (grande, mediano o pequeño): ");
						String PerroTamano = scanner.next();
						
						animales.add(new Perro (PerroNumChip, PerroNombre, PerroEdad, PerroRaza, PerroAdoptado, PerroTamano)); // Añade al ArrayList los datos introducidos por el usuario
						break;
					} else {
						break;
					}
					
				case 2:
					System.out.println("\nIntroduce el numero del chip del gato: ");
					int GatoNumChip = scanner.nextInt();	// Recoge el valor del chip introducido por el usuario
					boolean GatoExistente = false;	// Se declara la variable para decir si existe o no el animal
					
					for (Animal animal : animales) {	// Se utiliza un for para recorrer el ArrayList de animales
				        if (animal.numChip == GatoNumChip) {	// Con un if, comprobamos si existe ya el chip introducido
				        	System.out.println("El número del chip introducido ya existe, porfavor, introduzca un chip correcto.");
				        	GatoExistente = true;	// Establece que el animal si existe
				        	break;
				        } else {
				        	GatoExistente = false;	// Establece que el animal no existe
				        	continue;
				        }
					}
					
					if (GatoExistente == false) {	// Si la variable es falsa (no existe el animal), pide los datos al usuario
						System.out.println("\nIntroduce el nombre del gato: ");
						String GatoNombre = scanner.next();
						
						System.out.println("\nIntroduce la edad del gato: ");
						int GatoEdad = scanner.nextInt();
						
						System.out.println("\nIntroduce la raza del gato: ");
						String GatoRaza = scanner.next();
						
						System.out.println("\nIntroduce si el gato es adoptado (true o false): ");
						boolean GatoAdoptado = scanner.nextBoolean();
						
						System.out.println("\nIntroduce si el gato tiene leucemia (true o false): ");
						boolean GatoLeucemia = scanner.nextBoolean();
						
						animales.add(new Gato (GatoNumChip, GatoNombre, GatoEdad, GatoRaza, GatoAdoptado, GatoLeucemia));	// Añade al ArrayList los datos introducidos por el usuario
						break;
					} else {
						break;
					}
					
				case 3:
					System.out.println("\nIntroduce el número del chip: ");	// Se pide el número del chip para comprobar si existe el animal
					int AnimalChip = scanner.nextInt();
					
					for (Animal animal : animales) {	// Recorre la lista
				        if (animal.numChip == AnimalChip) {	// Verifica si hay animales con el chip del usuario
				        	animal.mostrar();
				        	break;
				        }
					}
					// Si no, rompe el for y muestra el mensaje de que no existe
					System.out.println("El número de chip introducido no existe, porfavor, pruebe de nuevo.");
					
					break;
					
				case 4:
					System.out.println("Has elegido la opción de salir.");
					System.out.println("Saliendo...");	// Muestra al usuario que ha elegido la opción de salir
					break;
					
				default:	// Para manejo de errores, establece que todo numero que no esté entre 1 y 4, diga el mensaje de que no es válido
					System.out.println("Porfavor, introduce un valor válido");	
			}
		}
		scanner.close();	// Cerramos la instancia del cursor
	}
}
