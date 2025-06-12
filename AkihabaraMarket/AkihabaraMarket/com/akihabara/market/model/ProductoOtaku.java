package com.akihabara.market.model;

public class ProductoOtaku {
	int id;
	String nombre;
	String categoria;
	double precio;
	int stock;
	
	public ProductoOtaku() {
	}
	
	public ProductoOtaku(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	public ProductoOtaku(String nombre, String categoria, double precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	public ProductoOtaku(int id) {
		this.id = id;
	}
	
	public ProductoOtaku(String nombre) {
		this.nombre = nombre;
	}
	
	public int getID() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
	
	public void setPrecio(double precio) {
        this.precio = precio;
    }
	
	public void setStock(int stock) {
        this.stock = stock;
    }
	
	@Override
	public String toString() {
		return "\nID: " + id + "\nNombre: " + nombre + "\nCategoría: " + categoria + "\nPrecio: " + precio + "\nStock: " + stock;
	}
}
