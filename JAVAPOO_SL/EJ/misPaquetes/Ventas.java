package misPaquetes;

import java.sql.*;
import java.util.*;

public class Ventas {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idVenta;
	public static int idCliente;
	public static int idArticulo;
	public static int cantidad;
	public static String fecha;
	
	public static void crearVenta() {
		try {
			System.out.println("ID Cliente: ");
			idCliente = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("ID Articulo: ");
			idArticulo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Cantidad: ");
			cantidad = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Fecha: ");
			fecha = scanner.nextLine();
			
			
			String sql1 = "INSERT INTO Ventas (id_cliente, id_articulo, cantidad, fecha_venta) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setInt(1, idCliente);
            pstmt1.setInt(2, idArticulo);
            pstmt1.setInt(3, cantidad);
            pstmt1.setString(4, fecha);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void mostrarVentas() {
		try {
			Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ventas");

            while (rs.next()) {
                System.out.println("\nID Venta: " + rs.getInt("id_venta") + "\nID Cliente: " + rs.getString("id_cliente") + "\nID Artículo: " + rs.getString("id_articulo") + "\nCantidad: " + rs.getString("cantidad") + "\nFecha: " + rs.getString("fecha_venta"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarVenta() {
		try {
			System.out.println("Introduce el id de la venta que desea modificar: ");
			idVenta = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Nuevo ID del cliente: ");
			idCliente = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Nuevo ID del artículo: ");
			idArticulo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Nueva cantidad: ");
			cantidad = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Nueva fecha: ");
			fecha = scanner.nextLine();
			
			
			String sql1 = "UPDATE Ventas SET id_cliente = ?, id_articulo = ?, cantidad = ?, fecha_venta = ? WHERE id_venta = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setInt(1, idCliente);
            pstmt1.setInt(2, idArticulo);
            pstmt1.setInt(3, cantidad);
            pstmt1.setString(4, fecha);
            pstmt1.setInt(5, idVenta);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void eliminarVenta() {
		try {
			System.out.println("Introduce el id de la venta que desea eliminar: ");
			idVenta = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "DELETE FROM Ventas WHERE id_venta = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

            pstmt1.setInt(1, idVenta);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
}
