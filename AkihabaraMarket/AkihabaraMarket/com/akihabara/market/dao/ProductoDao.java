package com.akihabara.market.dao;
import com.akihabara.market.model.*;

import java.util.*;
import java.sql.*;


public class ProductoDao {
	private DatabaseConnection datos = new DatabaseConnection();
	Connection conexion = datos.getConnection();
	
	Scanner scanner = new Scanner(System.in);
	
	public void agregarProducto(ProductoOtaku producto) {
		try {
			String nombre = producto.getNombre();
			String categoria = producto.getCategoria();
			double precio = producto.getPrecio();
			int stock = producto.getStock();
			
			String sql1 = "INSERT INTO productos (nombre, categoria, precio, stock) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setString(1, nombre);
			pstmt.setString(2, categoria);
			pstmt.setDouble(3, precio);
			pstmt.setInt(4, stock);
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public ProductoOtaku obtenerProductoPorId(int id) {
		try {
			ProductoOtaku producto = null;
			
			String sql1 = "SELECT * FROM productos WHERE id = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				producto = new ProductoOtaku(rs.getInt("id"), rs.getString("nombre"), rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"));
			}
			
			pstmt.close();
			rs.close();
			return producto;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
	public List<ProductoOtaku> obtenerTodosLosProductos() {
		try {
			List<ProductoOtaku> lista = new ArrayList<>();
			
			String sql1 = "SELECT * FROM productos";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductoOtaku producto = new ProductoOtaku(rs.getInt("id"), rs.getString("nombre"), rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"));
				lista.add(producto);
			}
			
			pstmt.close();
			rs.close();
			return lista;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
	public boolean actualizarProducto(ProductoOtaku producto) {
		try {
			int id = producto.getID();
			String nombre = producto.getNombre();
			String categoria = producto.getCategoria();
			double precio = producto.getPrecio();
			int stock = producto.getStock();
			
			String sql1 = "UPDATE productos SET nombre = ?, categoria = ?, precio = ?, stock = ? WHERE id = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
				
			pstmt.setString(1, nombre);
			pstmt.setString(2, categoria);
			pstmt.setDouble(3, precio);
			pstmt.setInt(4, stock);
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
			
			pstmt.close();
			System.out.println("Producto actualizado con éxito.");
			return true;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public boolean eliminarProducto(int id) {
		try {	
			String sql1 = "DELETE FROM productos WHERE id = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
				
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			pstmt.close();
			
			System.out.println("Producto eliminado con éxito.");
			return true;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public List<ProductoOtaku> buscarProductosPorNombre(String nombre) {
		try {
			List<ProductoOtaku> lista = new ArrayList<>();
			
			String sql1 = "SELECT * FROM productos WHERE nombre = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setString(1, nombre);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductoOtaku producto = new ProductoOtaku(rs.getInt("id"), rs.getString("nombre"), rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"));
				lista.add(producto);
			}
			
			pstmt.close();
			rs.close();
			return lista;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
	public List<ProductoOtaku> buscarProductoPorCategoria(String categoria) {
		try {
			List<ProductoOtaku> lista = new ArrayList<>();
			
			String sql1 = "SELECT * FROM productos WHERE categoria = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setString(1, categoria);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductoOtaku producto = new ProductoOtaku(rs.getInt("id"), rs.getString("nombre"), rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"));
				lista.add(producto);
			}
			
			pstmt.close();
			rs.close();
			return lista;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
}
