package misPaquetes;

import java.util.Scanner;

public class Menus {
	public static Scanner scanner = new Scanner(System.in);
	public static int opcion;
	
	public static int mostrarMenu() {
		System.out.println("\n------ Menú ------");
	    System.out.println("1. Gestión de Clientes.");
	    System.out.println("2. Gestión de Proveedores.");
	    System.out.println("3. Gestión de Artículos.");
	    System.out.println("4. Gestión de Facturas Recibidas.");
	    System.out.println("5. Gestión de Ventas.");
	    System.out.println("6. Informes de Ventas por Cliente.");
	    System.out.println("7. Salir.");
	    
	    System.out.println("\nElige una opción: ");
	    opcion = scanner.nextInt();
	    scanner.nextLine();
	    
	    return opcion;
	}
	
	public static void clientesMostrarMenu() {
		opcion = 0;
		while (opcion != 5) {
			System.out.println("\n------ Cliente ------");
		    System.out.println("1. Crear Cliente.");
		    System.out.println("2. Listar Clientes.");
		    System.out.println("3. Modificar Cliente.");
		    System.out.println("4. Eliminar Cliente.");
		    System.out.println("5. Salir.");
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	Cliente.crearCliente();
		    	break;
		    case 2:
		    	Cliente.mostrarClientes();
		    	break;
		    case 3:
		    	Cliente.modificarCliente();
		    	break;
		    case 4:
		    	Cliente.eliminarCliente();
		    	break;
		    case 5:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
	
	public static void proveedoresMostrarMenu() {
		opcion = 0;
		while (opcion != 5) {
			System.out.println("\n------ Proveedores ------");
		    System.out.println("1. Crear Proveedor.");
		    System.out.println("2. Listar Proveedores.");
		    System.out.println("3. Modificar Proveedor.");
		    System.out.println("4. Eliminar Proveedor.");
		    System.out.println("5. Salir.");
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	Proveedores.crearProveedor();
		    	break;
		    case 2:
		    	Proveedores.mostrarProveedores();
		    	break;
		    case 3:
		    	Proveedores.modificarProveedor();
		    	break;
		    case 4:
		    	Proveedores.eliminarProveedor();
		    	break;
		    case 5:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
	
	public static void articulosMostrarMenu() {
		opcion = 0;
		while (opcion != 5) {
			System.out.println("\n------ Artículos ------");
		    System.out.println("1. Crear Artículo.");
		    System.out.println("2. Listar Artículos.");
		    System.out.println("3. Modificar Artículo.");
		    System.out.println("4. Eliminar Artículo.");
		    System.out.println("5. Salir.");
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	Articulos.crearArticulo();
		    	break;
		    case 2:
		    	Articulos.mostrarArticulos();
		    	break;
		    case 3:
		    	Articulos.modificarArticulo();
		    	break;
		    case 4:
		    	Articulos.eliminarArticulo();
		    	break;
		    case 5:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
	
	public static void facturasMostrarMenu() {
		opcion = 0;
		while (opcion != 5) {
			System.out.println("\n------ Facturas ------");
		    System.out.println("1. Crear Factura.");
		    System.out.println("2. Listar Facturas.");
		    System.out.println("3. Modificar Factura.");
		    System.out.println("4. Eliminar Factura.");
		    System.out.println("5. Salir.");
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	FacturasRecibidas.crearFactura();
		    	break;
		    case 2:
		    	FacturasRecibidas.mostrarFacturas();
		    	break;
		    case 3:
		    	FacturasRecibidas.modificarFactura();
		    	break;
		    case 4:
		    	FacturasRecibidas.eliminarFactura();
		    	break;
		    case 5:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
	
	public static void ventasMostrarMenu() {
		opcion = 0;
		while (opcion != 5) {
			System.out.println("\n------ Ventas ------");
		    System.out.println("1. Crear Venta.");
		    System.out.println("2. Listar Ventas.");
		    System.out.println("3. Modificar Venta.");
		    System.out.println("4. Eliminar Venta.");
		    System.out.println("5. Salir.");
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	Ventas.crearVenta();
		    	break;
		    case 2:
		    	Ventas.mostrarVentas();
		    	break;
		    case 3:
		    	Ventas.modificarVenta();
		    	break;
		    case 4:
		    	Ventas.eliminarVenta();
		    	break;
		    case 5:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
	
	public static void informeMostrarMenu() {
		opcion = 0;
		while (opcion != 2) {
			System.out.println("\n------ Informe ------");
		    System.out.println("1. Buscar Informe.");
		    System.out.println("2. Salir.");
		    
		    
		    System.out.println("\nElige una opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcion) {
		    case 1:
		    	InformeVentas.mostrarInforme();
		    	break;
		    case 2:
		    	System.out.println("Volviendo al menú...");
		    	break;
		    default:
		    	System.out.println("Porfavor introduce un valor válido.");
		    	break;
		    }
		}
	}
}
