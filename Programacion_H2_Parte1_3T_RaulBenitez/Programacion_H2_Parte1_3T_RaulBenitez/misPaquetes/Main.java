package misPaquetes;

import java.sql.*; // Importar todo de java.sql
import java.util.*; // Importar todo de java.util

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/cine_RaulBenitez"; // Conexión a la base de datos
        String usuario = "root"; // Conexión a la base de datos
        String contraseña = "curso"; // Conexión a la base de datos
        Scanner scanner = new Scanner(System.in); // Crear una instancia del scanner
        int opcion = 0;
        
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            
            while (opcion != 2) {
            	System.out.println("\n------ Menú ------"); // Mostrar el menú de opciones
                System.out.println("1. Ver películas.");
                System.out.println("2. Salir.");
                System.out.println("\nElige una opción: ");
                opcion = scanner.nextInt(); //Pedir al usuario un número
                scanner.nextLine(); // Limpiar el búffer de entrada
                
                switch (opcion) { // Elegir entre las opciones del usuario
                	case 1:
                		Statement stmt = conexion.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT peliculas.idPelicula, nombre, director, anoPelicula, genero.genero FROM peliculas INNER JOIN genero ON peliculas.idPelicula = genero.idPelicula;"); // Consulta para mySQL

                		while (rs.next()) {
                            System.out.println("\nID: " + rs.getInt("idPelicula") + "\nNombre: " + rs.getString("nombre") + "\nDirector: " + rs.getString("director") + "\nAño: " + rs.getString("anoPelicula") + "\nGénero: " + rs.getString("genero")); // Mostrar los datos con formato
                        }
                		
                		break;
                	case 2:
                		System.out.println("Has elegido la opción de salir.");
                		break;
                	default: // Por si introduce un número que no sea 1 o 2
                		System.out.println("Introduce una opción correcta.");
                		break;
                }
            }
            conexion.close(); // Cerrar la conexión para evitar errores
            scanner.close(); // Cerrar el scanner para evitar errores
        } catch (SQLException e) { // Manejo de errores de SQL
            System.out.println("Error de conexión: " + e.getMessage());
        } catch (InputMismatchException e) { // Manejo de errores por valores incorrectos
        	System.out.println("Error, porfavor, introduce valores numéricos.");
        }
	}
}
