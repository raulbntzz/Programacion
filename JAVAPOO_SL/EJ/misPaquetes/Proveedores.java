package misPaquetes;

import java.sql.*;
import java.util.*;

public class Proveedores {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idProveedor;
	public static String nombre;
	public static String cif;
	public static String telefono;
	public static int opcion;

	public static void crearProveedor() {
		try {
			System.out.println("Nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Cif: ");
			cif = scanner.nextLine();
			
			System.out.println("Teléfono: ");
			telefono = scanner.nextLine();
			
			
			String sql1 = "INSERT INTO Proveedores (nombre, cif, telefono) VALUES (?, ?, ?)";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setString(2, cif);
            pstmt1.setString(3, telefono);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void mostrarProveedores() {
		try {
			Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Proveedores");

            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id_proveedor") + "\nNombre: " + rs.getString("nombre") + "\nCif: " + rs.getString("cif") + "\nTeléfono: " + rs.getString("telefono"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarProveedor() {
		try {
			System.out.println("Introduce el id del proveedor que desea modificar: ");
			idProveedor = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Introduce el nuevo nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Introduce el nuevo cif: ");
			cif = scanner.nextLine();
			
			System.out.println("Introduce el nuevo teléfono: ");
			telefono = scanner.nextLine();
			
			
			String sql1 = "UPDATE Proveedores SET nombre = ?, cif = ?, telefono = ? WHERE id_proveedor = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setString(2, cif);
            pstmt1.setString(3, telefono);
            pstmt1.setInt(4, idProveedor);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void eliminarProveedor() {
		try {
			System.out.println("Introduce el id del proveedor que desea eliminar: ");
			idProveedor = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "DELETE FROM Proveedores WHERE id_proveedor = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

            pstmt1.setInt(1, idProveedor);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
}
