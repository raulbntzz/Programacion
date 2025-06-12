package com.akihabara.market.view;

import java.util.*;
import com.akihabara.market.dao.*;
import com.akihabara.market.model.*;
import com.akihabara.market.service.*;

public class InterfazConsolaProductos {
	Scanner scanner = new Scanner(System.in);
	ProductoDao dao = new ProductoDao();
	LlmService llm = new LlmService();
	int opcion;
	
	//Logica
	public void logicaProductos() {
		opcion = 0;
		while (opcion != 9) {
			menuProductos();
			System.out.println("\nIntroduce la opción del menú:");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
			case 1:
				ProductoOtaku producto1 = pedirDatosProducto();
				dao.agregarProducto(producto1);
				break;
			case 2:
				ProductoOtaku id1 = pedirID();
				ProductoOtaku producto2 = dao.obtenerProductoPorId(id1.getID());
				System.out.println(producto2.toString());
				break;
			case 3:
				List<ProductoOtaku> datos1 = dao.obtenerTodosLosProductos();
				System.out.println(datos1.toString());
				break;
			case 4:
				ProductoOtaku nombre = pedirNombre();
				List<ProductoOtaku> datos2 = dao.buscarProductosPorNombre(nombre.getNombre());
				System.out.println(datos2.toString());
				break;
			case 5:
				ProductoOtaku categoria = pedirCategoria();
				List<ProductoOtaku> datos3 = dao.buscarProductoPorCategoria(categoria.getNombre());
				System.out.println(datos3.toString());
				break;
			case 6:
				ProductoOtaku producto3 = pedirDatosActualizarProducto();
				dao.actualizarProducto(producto3);
				break;
			case 7:
				ProductoOtaku producto4 = pedirDatosEliminarProducto();
				dao.eliminarProducto(producto4.getID());
				break;
			case 8:
				String datos4 = pedirDatosAPI();
				System.out.println(datos4);
				
				System.out.println("Estás seguro de que quieres guardar este nombre? (Y/N)");
				String respuesta = scanner.nextLine();
				
				while (true) {
					if (respuesta.equals("Y")) {
						ProductoOtaku producto5 = pedirDatosProductoAPI(datos4);
						dao.agregarProducto(producto5);
						System.out.println("Producto guardado con éxito.");
						break;
					} else if (respuesta.equals("N")) {
						System.out.println("El producto no se ha guardado.");
						break;
					} else {
						System.out.println("Porfavor introduce un valor correcto.");
					}
				}
				
				break;
			case 9:
				System.out.println("Volviendo al menú...");
				break;
			default:
				System.out.println("Porfavor introduce un número válido.");
				break;
			}
		}
	}
	
	//Mostrar Productos
	public void menuProductos() {
		System.out.println("\n------ Gestión Productos ------");
		System.out.println("1. Añadir Producto.");
		System.out.println("2. Consultar Producto Por ID.");
		System.out.println("3. Listar Todos Los Productos.");
		System.out.println("4. Listar Productos Por Nombre.");
		System.out.println("5. Listar Productos Por Categoría.");
		System.out.println("6. Actualizar Producto.");
		System.out.println("7. Eliminar Producto.");
		System.out.println("8. Sugerir Nombre Del Producto.");
		System.out.println("9. Salir Del Programa.");
	}
	
	//Agregar Producto
		public ProductoOtaku pedirDatosProducto() {
			try {
				System.out.println("\nIntroduce el nombre del producto:");
				String nombre = scanner.nextLine();
				
				System.out.println("\nIntroduce la categoría del producto:");
				String categoria = scanner.nextLine();
				
				System.out.println("\nIntroduce el precio del producto:");
				double precio = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("\nIntroduce el stock del producto:");
				int stock = scanner.nextInt();
				scanner.nextLine();
				
				return new ProductoOtaku(nombre, categoria, precio, stock);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Agregar Producto
		public ProductoOtaku pedirDatosProductoAPI(String nombre) {
			try {	
				System.out.println("\nIntroduce la categoría del producto:");
				String categoria = scanner.nextLine();
				
				System.out.println("\nIntroduce el precio del producto:");
				double precio = scanner.nextDouble();
				scanner.nextLine();
					
				System.out.println("\nIntroduce el stock del producto:");
				int stock = scanner.nextInt();
				scanner.nextLine();
					
				return new ProductoOtaku(nombre, categoria, precio, stock);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
			
			
		//Buscar Por ID
		public ProductoOtaku pedirID() {
			try {
				System.out.println("\nIntroduce el id del producto que desea buscar:");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				return new ProductoOtaku(id);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Buscar Por Nombre
		public ProductoOtaku pedirNombre() {
			try {
				System.out.println("\nIntroduce el nombre del producto que desea buscar:");
				String nombre = scanner.nextLine();
				
				return new ProductoOtaku(nombre);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Buscar Por Categoría
		public ProductoOtaku pedirCategoria() {
			try {
				System.out.println("\nIntroduce la categoría del producto que desea buscar:");
				String categoria = scanner.nextLine();
					
				return new ProductoOtaku(categoria);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Actualizar Producto
		public ProductoOtaku pedirDatosActualizarProducto() {
			try {
				System.out.println("\nIntroduce el id del producto que desea actualizar:");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("\nIntroduce el nombre del producto:");
				String nombre = scanner.nextLine();
				
				System.out.println("\nIntroduce la categoría del producto:");
				String categoria = scanner.nextLine();
				
				System.out.println("\nIntroduce el precio del producto:");
				double precio = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("\nIntroduce el stock del producto:");
				int stock = scanner.nextInt();
				scanner.nextLine();
				
				return new ProductoOtaku(id, nombre, categoria, precio, stock);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Eliminar Producto
		public ProductoOtaku pedirDatosEliminarProducto() {
			try {
				System.out.println("\nIntroduce el id del producto que desea eliminar:");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				return new ProductoOtaku(id);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Llamar API
		public String pedirDatosAPI() {
			System.out.println("\nIntroduce la categoría del producto:");
			String categoria = scanner.nextLine();
			
			System.out.println("\nIntroduce la franquicia del producto:");
			String franquicia = scanner.nextLine();
			
			String respuesta = llm.sugerirNombreProducto(categoria, franquicia);
			
			return respuesta;
		}
}
