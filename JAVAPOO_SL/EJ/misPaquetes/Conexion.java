package misPaquetes;

import java.sql.*;

public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3306/JAVAPOO_SL";
    private static final String usuario = "root";
    private static final String contraseña = "curso";
        
    public static Connection Conectar() {
        try {
            return DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
