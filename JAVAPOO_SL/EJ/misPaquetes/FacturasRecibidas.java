package misPaquetes;

import java.sql.*;
import java.util.*;

public class FacturasRecibidas {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idFactura;
	public static int idProveedor;
	public static String fecha;
	public static double total;
	public static int opcion;
	
	public static void crearFactura() {
		try {
			System.out.println("ID Proveedor: ");
			idProveedor = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Fecha: ");
			fecha = scanner.nextLine();
			
			System.out.println("Total: ");
			total = scanner.nextDouble();
			scanner.nextLine();
			
			String sql1 = "INSERT INTO Facturas_Recibidas (id_proveedor, fecha, total) VALUES (?, ?, ?)";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setInt(1, idProveedor);
            pstmt1.setString(2, fecha);
            pstmt1.setDouble(3, total);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void mostrarFacturas() {
		try {
			Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Facturas_Recibidas");

            while (rs.next()) {
                System.out.println("\nID Factura: " + rs.getInt("id_factura") + "\nID Proveedor: " + rs.getString("id_proveedor") + "\nFecha: " + rs.getString("fecha") + "\nTotal: " + rs.getString("total"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarFactura() {
		try {
			System.out.println("Introduce el id de la factura que desea modificar: ");
			idFactura = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Introduce el id del proveedor que desea modificar: ");
			idProveedor = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Fecha: ");
			fecha = scanner.nextLine();
			
			System.out.println("Total: ");
			total = scanner.nextDouble();
			scanner.nextLine();
			
			
			String sql1 = "UPDATE Facturas_Recibidas SET id_proveedor = ?, fecha = ?, total = ? WHERE id_factura = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setInt(1, idProveedor);
            pstmt1.setString(2, fecha);
            pstmt1.setDouble(3, total);
            pstmt1.setInt(4, idFactura);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void eliminarFactura() {
		try {
			System.out.println("Introduce el id de la factura que desea eliminar: ");
			idFactura = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "DELETE FROM Facturas_Recibidas WHERE id_factura = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

            pstmt1.setInt(1, idFactura);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
}
