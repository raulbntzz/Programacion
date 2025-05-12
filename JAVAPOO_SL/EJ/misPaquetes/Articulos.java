package misPaquetes;

import java.sql.*;
import java.util.*;

public class Articulos {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idArticulo;
	public static String nombre;
	public static double precio_unitario;
	public static int stock;
	public static int opcion;
	
	public static void crearArticulo() {
		try {
			System.out.println("Nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Pecio por unidad: ");
			precio_unitario = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Stock: ");
			stock = scanner.nextInt();
			scanner.nextLine();
			
			
			String sql1 = "INSERT INTO Articulos (nombre, precio_unitario, stock) VALUES (?, ?, ?)";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setDouble(2, precio_unitario);
            pstmt1.setInt(3, stock);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void mostrarArticulos() {
		try {
			Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Articulos");

            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id_articulo") + "\nNombre: " + rs.getString("nombre") + "\nPrecio por unidad: " + rs.getString("precio_unitario") + "\nStock: " + rs.getString("stock"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarArticulo() {
		try {
			System.out.println("Introduce el id del artículo que desea modificar: ");
			idArticulo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Introduce el nuevo nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Introduce el nuevo precio de la unidad: ");
			precio_unitario = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Introduce el stock: ");
			stock = scanner.nextInt();
			scanner.nextLine();
			
			
			String sql1 = "UPDATE Proveedores SET nombre = ?, precio_unitario = ?, stock = ? WHERE id_articulo = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setDouble(2, precio_unitario);
            pstmt1.setInt(3, stock);
            pstmt1.setInt(4, idArticulo);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void eliminarArticulo() {
		try {
			System.out.println("Introduce el id del artículo que desea eliminar: ");
			idArticulo = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "DELETE FROM Articulos WHERE id_articulo = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

            pstmt1.setInt(1, idArticulo);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
}
