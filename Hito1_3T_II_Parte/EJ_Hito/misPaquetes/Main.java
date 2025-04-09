package misPaquetes;	// Importamos las librerías necesarias
import java.util.Scanner;	// Importamos las librerías necesarias
import java.util.ArrayList;	// Importamos las librerías necesarias
import java.util.HashMap;	// Importamos las librerías necesarias

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Creamos una instancia del scanner
		ArrayList<Animal> animales = new ArrayList<>();	// Creamos un ArrayList para almacenar los datos de los animales
		HashMap<Integer, Persona> personas = new HashMap<>();	// Creamos un HashMap para almacenar los datos de las personas
		int opcion = 0;
		
		while (opcion != 7) {	// Mientras que la opción sea otra que 4 (Salir), muestre el menú al igual que sus opciones
			System.out.println("\n--- Elige una opción ---");	// Muestra el menú de opciones
			System.out.println("1. Añadir Perro");
			System.out.println("2. Añadir Gato");
			System.out.println("3. Buscar Animal");
			System.out.println("4. Realizar Adopción");
			System.out.println("5. Dar De Baja");
			System.out.println("6. Mostrar estadísticas de los gatos");
			System.out.println("7. Salir");
			opcion = scanner.nextInt();	// Obtiene el valor introducido por el usuario
			scanner.nextLine();
			
			switch (opcion) {	// Filtra el número introducido por el usuario para elegir la opción
				case 1:
					System.out.println("\nIntroduce el numero del chip del perro: ");
					int PerroNumChip = scanner.nextInt();	// Recoge el valor del chip introducido por el usuario
					scanner.nextLine();
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
						String PerroNombre = scanner.nextLine();
						
						System.out.println("\nIntroduce la edad del perro: ");
						int PerroEdad = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("\nIntroduce la raza del perro: ");
						String PerroRaza = scanner.nextLine();
						
						System.out.println("\nIntroduce si el perro está adoptado (true o false): ");
						boolean PerroAdoptado = scanner.nextBoolean();
						scanner.nextLine();
						
						System.out.println("\nIntroduce el tamaño del perro (grande, mediano o pequeño): ");
						String PerroTamano = scanner.nextLine();
						
						animales.add(new Perro (PerroNumChip, PerroNombre, PerroEdad, PerroRaza, PerroAdoptado, PerroTamano)); // Añade al ArrayList los datos introducidos por el usuario
						break;
					} else {
						break;
					}
					
				case 2:
					System.out.println("\nIntroduce el numero del chip del gato: ");
					int GatoNumChip = scanner.nextInt();	// Recoge el valor del chip introducido por el usuario
					scanner.nextLine();
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
					
					if (GatoExistente == false) {	// Si la variable es falsa (no existe el animal)
						System.out.println("\nIntroduce el nombre del gato: ");
						String GatoNombre = scanner.nextLine();
						
						System.out.println("\nIntroduce la edad del gato: ");	// Pide los datos al usuario
						int GatoEdad = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("\nIntroduce la raza del gato: ");
						String GatoRaza = scanner.nextLine();
						
						System.out.println("\nIntroduce si el gato está adoptado (true o false): ");
						boolean GatoAdoptado = scanner.nextBoolean();
						scanner.nextLine();
						
						System.out.println("\nIntroduce si el gato tiene leucemia (true o false): ");
						boolean GatoLeucemia = scanner.nextBoolean();
						scanner.nextLine();
						
						animales.add(new Gato (GatoNumChip, GatoNombre, GatoEdad, GatoRaza, GatoAdoptado, GatoLeucemia));	// Añade al ArrayList los datos introducidos por el usuario
						break;
					} else {
						break;
					}
					
				case 3:
					System.out.println("\nIntroduce el número del chip: ");	// Se pide el número del chip para comprobar si existe el animal
					int AnimalChip = scanner.nextInt();
					scanner.nextLine();
					
					for (Animal animal : animales) {	// Recorre la lista
				        if (animal.numChip == AnimalChip) {	// Verifica si hay animales con el chip del usuario
				        	animal.mostrar();
				        	break;
				        } else {
				        	// Si no, rompe el for y muestra el mensaje de que no existe
							System.out.println("El número de chip introducido no existe, porfavor, pruebe de nuevo.");
				        }
					}
					
					break;
				case 4:
					System.out.println("\nIntroduce el número del chip del animal que desea adoptar: ");	// Se pide el número del chip para comprobar si existe el animal
					int adoptar = scanner.nextInt();
					scanner.nextLine();
					
					for (Animal animal : animales) {	// Recorre la lista
				        if (animal.numChip == adoptar && animal.adoptado == false) {	// Verifica si hay animales con el chip del usuario
					        	System.out.println("\nIntroduce tu nombre: ");
								String nombre = scanner.nextLine();
								
								System.out.println("\nIntroduce tus apellidos: ");	// Pide los datos al usuario
								String apellidos = scanner.nextLine();
								
								System.out.println("\nIntroduce tu DNI: ");
								String dni = scanner.nextLine();
								
								System.out.println("\nIntroduce tu domicilio: ");
								String direccion = scanner.nextLine();
								
								System.out.println("\nIntroduce tu número de teléfono: ");
								String telefono = scanner.nextLine();
								
								System.out.println("\nIntroduce tu correo electrónico: ");
								String correo = scanner.nextLine();
								
								personas.put(adoptar, new Persona(nombre, apellidos, dni, direccion, telefono, correo));	// Introduce los datos del usuario en un HashMap junto al id del animal adoptado
								animal.adoptado = true;
								
								System.out.println("El animal ha sido adoptado correctamente");
				        	break;
				        } else {
				        	System.out.println("\nEl animal introducido ya ha sido adoptado o no existe");
				        	break;
				        }
					}
					break;
				case 5:
					System.out.println("\nIntroduce el número del chip del animal que desea dar de baja: ");	// Se pide el número del chip para dar de baja al animal
					int darBaja = scanner.nextInt();
					scanner.nextLine();
					
					for (int i = 0; i < animales.size(); i++) {
				        if (animales.get(i).numChip == darBaja) {
				            animales.remove(i);
				            System.out.println("El animal ha sido dado de baja correctamente");
				            break;
				        }
				    }
					
					break;
				
				case 6:
					int totalGatos = 0;	// Declarar variables
					int gatosLeucemia = 0;
					
					for (Animal animal : animales) {	// Recorre la lista para sumar a la variable respectiva
				        if (animal instanceof Gato) {
				        	totalGatos = totalGatos + 1;
				        	if (((Gato) animal).testLeucemia == true) {
				        		gatosLeucemia = gatosLeucemia + 1;
				        	}
				        }
					}
					
					System.out.println("Total de gatos: " + totalGatos);	// Muestra el total de gatos y cuales tienen el test de leucemia
					System.out.println("Gatos con el test de leucemia: " + gatosLeucemia);
					
					break;
					
				case 7:
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