package misPaquetes;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Libro> biblioteca = new ArrayList<>();
		
		int opcion = 0;
		
		while (opcion != 4) {
			System.out.println("\n------ Menú ------");
			System.out.println("1. Añadir un nuevo libro.");
			System.out.println("2. Mostrar todos los libros.");
			System.out.println("3. Buscar un libro por título o autor.");
			System.out.println("4. Salir.");
			System.out.println("\nIntroduce una opción:");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
				case 1:
					try {
						System.out.println("Introduce el título del libro: ");
						String titulo = scanner.nextLine();
						
						System.out.println("Introduce el nombre del autor del libro: ");
						String autor = scanner.nextLine();
						
						System.out.println("Introduce el ISBN del libro: ");
						String ISBN = scanner.nextLine();
						
						System.out.println("Introduce el año de publicación del libro: ");
						int anoPublicacion = scanner.nextInt();
						scanner.nextLine();
						
						Libro libro = new Libro(titulo.toLowerCase(), autor.toLowerCase(), ISBN.toLowerCase(), anoPublicacion);
						biblioteca.add(libro);

						try {
				            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("biblioteca.ser"));
				            out.writeObject(biblioteca);
				            out.close();
				            System.out.println("Libro guardado correctamente.");
				        } catch (IOException e) {
				            System.out.println("Error guardando el objeto: " + e.getMessage());
				        }
					} catch (InputMismatchException e) {
                        System.out.println("Error: El año de publicación debe ser un número entero.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Error inesperado: " + e.getMessage());
                    }

					break;
				case 2:
					try {
				        ObjectInputStream in = new ObjectInputStream(new FileInputStream("biblioteca.ser"));
				        ArrayList<Libro> bibliotecaRecuperada = (ArrayList<Libro>) in.readObject();
				        in.close();
				        if (bibliotecaRecuperada.isEmpty()) {
				            System.out.println("No hay libros en la biblioteca.");
				        } else {
				            for (Libro libro : bibliotecaRecuperada) {
				                System.out.println(libro.mostrar());
				            }
				        }
				    } catch (FileNotFoundException e) {
				        System.out.println("No se encontró el archivo 'biblioteca.ser' o no hay libros guardados aún.");
				    } catch (IOException | ClassNotFoundException e) {
				        System.out.println("Error: " + e.getMessage());
				    }
					break;
				case 3:
					try {
				        ObjectInputStream in = new ObjectInputStream(new FileInputStream("biblioteca.ser"));
				        ArrayList<Libro> bibliotecaRecuperada = (ArrayList<Libro>) in.readObject();
				        in.close();

				        System.out.println("Introduce el nombre del libro a buscar: ");
				        String buscarTitulo = scanner.nextLine();
				        
				        for (Libro libro : bibliotecaRecuperada) {
				            if (libro.getTitulo().toLowerCase().contains(buscarTitulo) || 
				                libro.getAutor().toLowerCase().contains(buscarTitulo)) {
				                System.out.println(libro.mostrar());
				            }
				        }
				    } catch (FileNotFoundException e) {
				        System.out.println("No se encontró el archivo 'biblioteca.ser' o no hay libros guardados aún.");
				    } catch (IOException | ClassNotFoundException e) {
				        System.out.println("Error: " + e.getMessage());
				    }
					break;
				case 4:
					break;
				default:
					System.out.println("Opción no válida, porfavor, introduce un valor válido.");
					break;
			}
		}
	}
}
