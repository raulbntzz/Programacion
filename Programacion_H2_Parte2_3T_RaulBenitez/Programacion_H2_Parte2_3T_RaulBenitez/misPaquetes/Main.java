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
            
            while (opcion != 5) {
            	System.out.println("\n------ Menú ------"); // Mostrar el menú de opciones
                System.out.println("1. Ver Películas.");
                System.out.println("2. Añadir Película.");
                System.out.println("3. Eliminar Película.");
                System.out.println("4. Modificar Película.");
                System.out.println("5. Salir.");
                System.out.println("\nElige una opción: ");
                opcion = scanner.nextInt(); //Pedir al usuario un número
                scanner.nextLine(); // Limpiar el búffer de entrada
                
                switch (opcion) { // Elegir entre las opciones del usuario
                	case 1:
                		Statement stmt1 = conexion.createStatement();
                        ResultSet rs1 = stmt1.executeQuery("SELECT peliculas.idPelicula, nombre, director, anoPelicula, genero.genero FROM peliculas INNER JOIN genero ON peliculas.idPelicula = genero.idPelicula;"); // Consulta para mySQL

                		while (rs1.next()) {
                            System.out.println("\nID: " + rs1.getInt("idPelicula") + "\nNombre: " + rs1.getString("nombre") + "\nDirector: " + rs1.getString("director") + "\nAño: " + rs1.getString("anoPelicula") + "\nGénero: " + rs1.getString("genero")); // Mostrar los datos con formato
                        }
                		
                		break;
                	case 2:
                		try {
                			System.out.println("Introduce el id de la película");
                    		int idPelicula = scanner.nextInt();
                    		scanner.nextLine();
                    		
                    		System.out.println("Introduce el nombre de la película");
                    		String nombre = scanner.nextLine();
                    		
                    		System.out.println("Introduce el nombre del director de la película");
                    		String director = scanner.nextLine();
                    		
                    		System.out.println("Introduce el año de la película");
                    		int ano = scanner.nextInt();
                    		scanner.nextLine();
                    		
                    		System.out.println("Introduce el género de la película");
                    		String genero = scanner.nextLine();
                    		
                    		String sql1 = "INSERT INTO peliculas (idPelicula, nombre, director, anoPelicula) VALUES (?, ?, ?, ?)";
                            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

                            pstmt1.setInt(1, idPelicula);
                            pstmt1.setString(2, nombre);
                            pstmt1.setString(3, director);
                            pstmt1.setInt(4, ano);
                            pstmt1.executeUpdate();
                            pstmt1.close();
                            
                            String sql2 = "INSERT INTO genero (idPelicula, genero) VALUES (?, ?)";
                            PreparedStatement pstmt2 = conexion.prepareStatement(sql2);

                            pstmt2.setInt(1, idPelicula);
                            pstmt2.setString(2, genero);
                            pstmt2.executeUpdate();
                            pstmt2.close();
                            
                            System.out.println("Película creada correctamente.");
                            break;
                		} catch (SQLException e) { // Manejo de errores de SQL
                            System.out.println("Error, id de película duplicado.");
                            break;
                        } catch (InputMismatchException e) { // Manejo de errores por valores incorrectos
                        	System.out.println("Error, porfavor, introduce valores numéricos.");
                        	break;
                        }
                	case 3:
                		System.out.println("Introduce el id de la película");
                		int idPelicula = scanner.nextInt();
                		scanner.nextLine();
                		boolean encontrado = false;
                		
                		Statement stmt2 = conexion.createStatement();
                        ResultSet rs2 = stmt2.executeQuery("SELECT idPelicula FROM peliculas"); // Consulta para mySQL
                        
                        while (rs2.next()) {
                        	if (idPelicula == rs2.getInt("idPelicula")) {
                        		String sql3 = "DELETE FROM peliculas WHERE idPelicula = ?"; // Consulta para mySQL
                                PreparedStatement pstmt3 = conexion.prepareStatement(sql3);

                                pstmt3.setInt(1, idPelicula);
                                pstmt3.executeUpdate();
                                pstmt3.close();
                                
                                System.out.println("Película eliminada correctamente.");
                                encontrado = true;
                        	} 
                        }
                        
                        if (encontrado == false) {
                        	System.out.println("No se ha encontrado la película.");
                        }
                        
                        break;
                	case 4:
                		System.out.println("Introduce el id de la película que desea modificar");
                		int idPelicula1 = scanner.nextInt();
                		scanner.nextLine();
                		boolean encontrado2 = false;
                		
                		Statement stmt3 = conexion.createStatement();
                        ResultSet rs3 = stmt3.executeQuery("SELECT idPelicula FROM peliculas");
                        
                		while (rs3.next()) {
                        	if (idPelicula1 == rs3.getInt("idPelicula")) {
                        		System.out.println("Introduce el nuevo nombre del director de la película");
                        		String director = scanner.nextLine();
                        		
                        		System.out.println("Introduce el nuevo género de la película");
                        		String genero = scanner.nextLine();
                        		
                        		String sql4 = "UPDATE peliculas SET director = ? WHERE idPelicula = ?";
                                PreparedStatement pstmt4 = conexion.prepareStatement(sql4);
                                
                                pstmt4.setString(1, director);
                                pstmt4.setInt(2, idPelicula1);
                                pstmt4.executeUpdate();
                                pstmt4.close();
                                
                                
                                String sql5 = "UPDATE genero SET genero = ? WHERE idPelicula = ?";
                                PreparedStatement pstmt5 = conexion.prepareStatement(sql5);
                                
                                pstmt5.setString(1, genero);
                                pstmt5.setInt(2, idPelicula1);
                                pstmt5.executeUpdate();
                                pstmt5.close();
                                
                                System.out.println("Película actualizada correctamente.");
                                encontrado2 = true;
                        	} 
                        }
                        
                        if (encontrado2 == false) {
                        	System.out.println("No se ha encontrado la película.");
                        }

                        break;
                	case 5:
                		System.out.println("Has elegido la opción de salir.");
                		break;
                	default: // Por si introduce un número que esté entre 1 - 5
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
