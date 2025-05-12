package misPaquetes;

import java.sql.*;
import java.util.*;

public class Cliente {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idCliente;
	public static String nombre;
	public static String email;
	public static String telefono;
	public static int opcion;
	
	public static void crearCliente() {
		try {
			System.out.println("Nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Email: ");
			email = scanner.nextLine();
			
			System.out.println("Teléfono: ");
			telefono = scanner.nextLine();
			
			
			String sql1 = "INSERT INTO Clientes (nombre, email, telefono) VALUES (?, ?, ?)";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setString(2, email);
            pstmt1.setString(3, telefono);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void mostrarClientes() {
		try {
			Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Clientes");

            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id_cliente") + "\nNombre: " + rs.getString("nombre") + "\nEmail: " + rs.getString("email") + "\nTeléfono: " + rs.getString("telefono"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarCliente() {
		try {
			System.out.println("Introduce el id del cliente que desea modificar: ");
			idCliente = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Introduce el nuevo nombre: ");
			nombre = scanner.nextLine();
			
			System.out.println("Introduce el nuevo email: ");
			email = scanner.nextLine();
			
			System.out.println("Introduce el nuevo teléfono: ");
			telefono = scanner.nextLine();
			
			
			String sql1 = "UPDATE Clientes SET nombre = ?, email = ?, telefono = ? WHERE id_cliente = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setString(1, nombre);
            pstmt1.setString(2, email);
            pstmt1.setString(3, telefono);
            pstmt1.setInt(4, idCliente);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
	
	public static void eliminarCliente() {
		try {
			System.out.println("Introduce el id del cliente que desea eliminar: ");
			idCliente = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "DELETE FROM Clientes WHERE id_cliente = ?";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);

            pstmt1.setInt(1, idCliente);
            pstmt1.executeUpdate();
            pstmt1.close();

		} catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}
}
