package com.akihabara.market.view;

import java.util.*;
import com.akihabara.market.dao.*;
import com.akihabara.market.model.*;
import java.time.*;

public class InterfazConsolaClientes {
	Scanner scanner = new Scanner(System.in);
	ClienteDao dao = new ClienteDao();
	int opcion;
	
	//Logica
	public void logicaClientes() {
		opcion = 0;
		while (opcion != 7) {
			menuClientes();
			System.out.println("\nIntroduce la opción del menú:");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
			case 1:
				ClienteOtaku cliente1 = pedirDatosCliente();
				dao.agregarCliente(cliente1);
				break;
			case 2:
				ClienteOtaku dni1 = pedirDNI();
				ClienteOtaku cliente2 = dao.obtenerClientePorDNI(dni1.getDNI());
				System.out.println(cliente2.toString());
				break;
			case 3:
				List<ClienteOtaku> datos1 = dao.obtenerTodosLosClientes();
				System.out.println(datos1.toString());
				break;
			case 4:
				ClienteOtaku nombre = pedirNombre();
				List<ClienteOtaku> datos2 = dao.buscarClientesPorNombre(nombre.getNombre());
				System.out.println(datos2.toString());
				break;
			case 5:
				ClienteOtaku cliente3 = pedirDatosActualizarCliente();
				dao.actualizarCliente(cliente3);
				break;
			case 6:
				ClienteOtaku cliente4 = pedirDatosEliminarCliente();
				dao.eliminarCliente(cliente4.getDNI());
				break;
			case 7:
				System.out.println("Volviendo al menú...");
				break;
			default:
				System.out.println("Porfavor introduce un número válido.");
				break;
			}
		}
	}
	
	//Mostrar Clientes
	public void menuClientes() {
		System.out.println("\n------ Gestión Clientes ------");
		System.out.println("1. Añadir Cliente.");
		System.out.println("2. Consultar Cliente Por ID.");
		System.out.println("3. Listar Todos Los Clientes.");
		System.out.println("4. Listar Clientes Por Nombre.");
		System.out.println("5. Actualizar Cliente.");
		System.out.println("6. Eliminar Cliente.");
		System.out.println("7. Salir Del Programa.");
	}
	
	//Agregar Producto
		public ClienteOtaku pedirDatosCliente() {
			try {
				System.out.println("\nIntroduce el dni del cliente:");
				int dni = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("\nIntroduce el nombre del cliente:");
				String nombre = scanner.nextLine();
				
				System.out.println("\nIntroduce el email del cliente:");
				String email = scanner.nextLine();
				
				System.out.println("\nIntroduce el teléfono del cliente:");
				String telefono = scanner.nextLine();

				LocalDate date = LocalDate.now();
				String fecha = date.toString();
				
				return new ClienteOtaku(dni, nombre, email, telefono, fecha);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Agregar Cliente
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
			
			
		//Buscar Por DNI
		public ClienteOtaku pedirDNI() {
			try {
				System.out.println("\nIntroduce el dni del cliente que desea buscar:");
				int dni = scanner.nextInt();
				scanner.nextLine();
				
				return new ClienteOtaku(dni);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Buscar Cliente Por Nombre
		public ClienteOtaku pedirNombre() {
			try {
				System.out.println("\nIntroduce el nombre del producto que desea buscar:");
				String nombre = scanner.nextLine();
				
				return new ClienteOtaku(nombre);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Actualizar Cliente
		public ClienteOtaku pedirDatosActualizarCliente() {
			try {
				System.out.println("\nIntroduce el dni del cliente que desea actualizar:");
				int dni = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("\nIntroduce el nombre del cliente:");
				String nombre = scanner.nextLine();
				
				System.out.println("\nIntroduce la categoría del cliente:");
				String email = scanner.nextLine();
				
				System.out.println("\nIntroduce el precio del cliente:");
				String telefono = scanner.nextLine();
				
				LocalDate date = LocalDate.now();
				String fecha = date.toString();
				
				return new ClienteOtaku(dni, nombre, email, telefono, fecha);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
		
		
		//Eliminar Cliente
		public ClienteOtaku pedirDatosEliminarCliente() {
			try {
				System.out.println("\nIntroduce el dni del cliente que desea eliminar:");
				int dni = scanner.nextInt();
				scanner.nextLine();
				
				return new ClienteOtaku(dni);
			} catch (InputMismatchException e) {
				System.out.println("Error: " + e);
				return null;
			}
		}
}
