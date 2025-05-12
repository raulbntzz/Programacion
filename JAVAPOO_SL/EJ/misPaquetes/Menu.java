package misPaquetes;

import java.util.*;

public class Menu {
	public static Scanner scanner = new Scanner(System.in);
	public static int opcion;
	
	public static void menu() {
		while (opcion != 7) {
			opcion = Menus.mostrarMenu();
		    switch (opcion) {
			    case 1:
			    	Menus.clientesMostrarMenu();
			    	break;
			    case 2:
			    	Menus.proveedoresMostrarMenu();
			    	break;
			    case 3:
			    	Menus.articulosMostrarMenu();
			    	break;
			    case 4:
			    	Menus.facturasMostrarMenu();
			    	break;
			    case 5:
			    	Menus.ventasMostrarMenu();
			    	break;
			    case 6:
			    	Menus.informeMostrarMenu();
			    	break;
			    case 7:
			    	System.out.println("Has elegido la opción de salir.");
			    	break;
			    default:
			    	System.out.println("Porfavor introduce un valor válido.");
			    	break;
		    }
		}
	}
}
