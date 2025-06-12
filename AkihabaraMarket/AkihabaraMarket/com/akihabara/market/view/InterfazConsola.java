package com.akihabara.market.view;
import java.util.*;

public class InterfazConsola {
	Scanner scanner = new Scanner(System.in);
	InterfazConsolaProductos productos = new InterfazConsolaProductos();
	InterfazConsolaClientes clientes = new InterfazConsolaClientes();
	int opcion;
	
	public void mostrarMenu() {
		try {
			while (opcion != 3) {
				System.out.println("\n------ Menú Opciones ------");
				System.out.println("1. Gestión Productos.");
				System.out.println("2. Gestión Clientes.");
				System.out.println("4. Salir Del Programa.");
				
				System.out.println("\nIntroduce la opción del menú:");
				opcion = scanner.nextInt();
				scanner.nextLine();
				
				switch (opcion) {
				case 1: // Productos
					productos.logicaProductos();
					break;
				case 2: //Clientes
					clientes.logicaClientes();
					break;
				case 3:
					System.out.println("Has elegido la opción de salir. Hasta pronto.");
					break;
				default:
					System.out.println("Porfavor introduce un número válido.");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e);
		}
	}
}
