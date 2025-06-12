package com.akihabara.market.model;

public class ClienteOtaku {
	int dni;
	String nombre;
	String email;
	String telefono;
	String fecha_registro;
	
	public ClienteOtaku() {
	}
	
	public ClienteOtaku(int dni, String nombre, String email, String telefono, String fecha_registro) {
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.fecha_registro = fecha_registro;
	}
	
	public ClienteOtaku(String nombre, String email, String telefono, String fecha_registro) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.fecha_registro = fecha_registro;
	}
	
	public ClienteOtaku(int dni) {
		this.dni = dni;
	}
	
	public ClienteOtaku(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDNI() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getFecha() {
		return fecha_registro;
	}
	
	public void setDNI(int dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	public void setEmail(String email) {
        this.email = email;
    }
	
	public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
	
	public void setFecha(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
	
	@Override
	public String toString() {
		return "\nDNI: " + dni + "\nNombre: " + nombre + "\nEmail: " + email + "\nTeléfono: " + telefono + "\nFecha De Registro: " + fecha_registro;
	}
}
