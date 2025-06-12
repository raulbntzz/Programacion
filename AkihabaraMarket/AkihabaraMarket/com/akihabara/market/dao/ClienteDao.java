package com.akihabara.market.dao;
import com.akihabara.market.model.*;

import java.util.*;
import java.sql.*;


public class ClienteDao {
	private DatabaseConnection datos = new DatabaseConnection();
	Connection conexion = datos.getConnection();
	
	Scanner scanner = new Scanner(System.in);
	
	public void agregarCliente(ClienteOtaku cliente) {
		try {
			int dni = cliente.getDNI();
			String nombre = cliente.getNombre();
			String email = cliente.getEmail();
			String telefono = cliente.getTelefono();
			String fecha = cliente.getFecha();
			
			String sql1 = "INSERT INTO clientes (dni, nombre, email, telefono, fecha_registro) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setInt(1, dni);
			pstmt.setString(2, nombre);
			pstmt.setString(3, email);
			pstmt.setString(4, telefono);
			pstmt.setString(5, fecha);
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public ClienteOtaku obtenerClientePorDNI(int dni) {
		try {
			ClienteOtaku cliente = null;
			
			String sql1 = "SELECT * FROM clientes WHERE dni = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setInt(1, dni);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				cliente = new ClienteOtaku(rs.getInt("dni"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"), rs.getString("fecha_registro"));
			}
			
			pstmt.close();
			rs.close();
			return cliente;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
	public List<ClienteOtaku> obtenerTodosLosClientes() {
		try {
			List<ClienteOtaku> lista = new ArrayList<>();
			
			String sql1 = "SELECT * FROM clientes";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ClienteOtaku cliente = new ClienteOtaku(rs.getInt("dni"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"), rs.getString("fecha_registro"));
				lista.add(cliente);
			}
			
			pstmt.close();
			rs.close();
			return lista;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
	public boolean actualizarCliente(ClienteOtaku cliente) {
		try {
			int dni = cliente.getDNI();
			String nombre = cliente.getNombre();
			String email = cliente.getEmail();
			String telefono = cliente.getTelefono();
			String fecha = cliente.getFecha();
			
			String sql1 = "UPDATE clientes SET nombre = ?, email = ?, telefono = ?, fecha_registro = ? WHERE dni = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
				
			pstmt.setString(1, nombre);
			pstmt.setString(2, email);
			pstmt.setString(3, telefono);
			pstmt.setString(4, fecha);
			pstmt.setInt(5, dni);
			pstmt.executeUpdate();
			
			pstmt.close();
			System.out.println("Cliente actualizado con éxito.");
			return true;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public boolean eliminarCliente(int dni) {
		try {	
			String sql1 = "DELETE FROM clientes WHERE dni = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
				
			pstmt.setInt(1, dni);
			pstmt.executeUpdate();
			
			pstmt.close();
			
			System.out.println("Cliente eliminado con éxito.");
			return true;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public List<ClienteOtaku> buscarClientesPorNombre(String nombre) {
		try {
			List<ClienteOtaku> lista = new ArrayList<>();
			
			String sql1 = "SELECT * FROM clientes WHERE nombre = ?";
			PreparedStatement pstmt = conexion.prepareStatement(sql1);
			
			pstmt.setString(1, nombre);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ClienteOtaku cliente = new ClienteOtaku(rs.getInt("dni"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"), rs.getString("fecha_registro"));
				lista.add(cliente);
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
