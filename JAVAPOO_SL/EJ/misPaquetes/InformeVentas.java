package misPaquetes;

import java.sql.*;
import java.util.*;

public class InformeVentas {
	public static Connection conexion = Conexion.Conectar();
	public static Scanner scanner = new Scanner(System.in);
	
	public static int idCliente;
	
	public static void mostrarInforme() {
		try {
			System.out.println("Introduce el id del cliente: ");
			idCliente = scanner.nextInt();
			scanner.nextLine();
			
			String sql1 = "SELECT c.nombre AS Nombre_Cliente, a.nombre AS Articulo_Comprado, v.cantidad AS Cantidad, v.fecha_venta AS Fecha_Compra, (v.cantidad * a.precio_unitario) AS Total_Gastado FROM Clientes c JOIN Ventas v ON c.id_cliente = v.id_cliente JOIN Articulos a ON v.id_articulo = a.id_articulo WHERE c.id_cliente = ? ORDER BY c.nombre, v.fecha_venta;";
            PreparedStatement pstmt1 = conexion.prepareStatement(sql1);
            
            pstmt1.setInt(1, idCliente);
            ResultSet rs = pstmt1.executeQuery();

            while (rs.next()) {
                System.out.println("\nNombre: " + rs.getString("Nombre_Cliente") + "\nArtículo Comprado: " + rs.getString("Articulo_Comprado") + "\nCantidad: " + rs.getInt("Cantidad") + "\nFecha De La Compra: " + rs.getString("Fecha_Compra") + "\nTotal Gastado: " + rs.getDouble("Total_Gastado"));
            }

		} catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
	
	
}
