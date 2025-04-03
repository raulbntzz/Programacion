package misPaquetes;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Cuenta> operaciones = new HashMap<>();
		
		CuentaAhorro ca1 = new CuentaAhorro("ESBN 666 69", 1000.0, 2.5);
        CuentaAhorro ca2 = new CuentaAhorro("ESBN 777 69", 5000.0, 3.0);
        CuentaCorriente cc1 = new CuentaCorriente("ESBN 888 69", 2000.0, 500.0);
        CuentaCorriente cc2 = new CuentaCorriente("ESBN 999 69", -200.0, 1000.0);
	
        operaciones.put(ca1.numeroCuenta, ca1);
        operaciones.put(ca2.numeroCuenta, ca2);
        operaciones.put(cc1.numeroCuenta, cc1);
        operaciones.put(cc2.numeroCuenta, cc2);
        
        for (Cuenta operacion : operaciones.values()) {
            System.out.println(((Auditable)operacion).obtenerDetalles());
        }
	}
}
