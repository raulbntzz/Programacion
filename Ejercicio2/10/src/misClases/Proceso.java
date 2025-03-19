package misClases;

public class Proceso {
    public static void pasoUno() {
	System.out.println("Iniciando proceso...");
    }

    public static void pasoDos() {
	pasoUno();
	System.out.println("Proceso completado");
    }
}
